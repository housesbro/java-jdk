(ns javax.annotation.processing.Filer
  "This interface supports the creation of new files by an annotation
  processor.  Files created in this way will be known to the
  annotation processing tool implementing this interface, better
  enabling the tool to manage them.  Source and class files so
  created will be considered for processing by the tool in a subsequent javax.annotation.processing.round of processing after the close
  method has been called on the Writer or OutputStream used to write the contents of the file.

  Three kinds of files are distinguished: source files, class files,
  and auxiliary resource files.

   There are two distinguished supported locations (subtrees
  within the logical file system) where newly created files are
  placed: one for new source files, and
  one for new
  class files.  (These might be specified on a tool's command line,
  for example, using flags such as -s and -d.)  The
  actual locations for new source files and new class files may or
  may not be distinct on a particular run of the tool.  Resource
  files may be created in either location.  The methods for reading
  and writing resources take a relative name argument.  A relative
  name is a non-null, non-empty sequence of path segments separated
  by '/'; '.' and '..' are invalid path
  segments.  A valid relative name must match the
  `path-rootless` rule of RFC 3986, section
  3.3.

  The file creation methods take a variable number of arguments to
  allow the originating elements to be provided as hints to
  the tool infrastructure to better manage dependencies.  The
  originating elements are the types or packages (representing package-info files) which caused an annotation processor to
  attempt to create a new file.  For example, if an annotation
  processor tries to create a source file, GeneratedFromUserSource, in response to processing



   @Generate
   public class UserSource {}

  the type element for UserSource should be passed as part of
  the creation method call as in:



       filer.createSourceFile(`GeneratedFromUserSource`,
                              eltUtils.getTypeElement(`UserSource`));

  If there are no originating elements, none need to be passed.  This
  information may be used in an incremental environment to determine
  the need to rerun processors or remove generated files.
  Non-incremental environments may ignore the originating element
  information.

   During each run of an annotation processing tool, a file with a
  given pathname may be created only once.  If that file already
  exists before the first attempt to create it, the old contents will
  be deleted.  Any subsequent attempt to create the same file during
  a run will throw a FilerException, as will attempting to
  create both a class file and source file for the same type name or
  same package name.  The javax.annotation.processing.initial inputs to
  the tool are considered to be created by the zeroth round;
  therefore, attempting to create a source or class file
  corresponding to one of those inputs will result in a FilerException.

   In general, processors must not knowingly attempt to overwrite
  existing files that were not generated by some processor.  A Filer may reject attempts to open a file corresponding to an
  existing type, like java.lang.Object.  Likewise, the
  invoker of the annotation processing tool must not knowingly
  configure the tool such that the discovered processors will attempt
  to overwrite existing files that were not generated.

   Processors can indicate a source or class file is generated by
  including an @Generated
  annotation.

   Note that some of the effect of overwriting a file can be
  achieved by using a decorator-style pattern.  Instead of
  modifying a class directly, the class is designed so that either
  its superclass is generated by annotation processing or subclasses
  of the class are generated by annotation processing.  If the
  subclasses are generated, the parent class may be designed to use
  factories instead of public constructors so that only subclass
  instances would be presented to clients of the parent class."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.annotation.processing Filer]))

(defn create-source-file
  "Creates a new source file and returns an object to allow
   writing to it.  The file's name and path (relative to the
   root output location
   for source files) are based on the type to be declared in that
   file.  If more than one type is being declared, the name of the
   principal top-level type (the public one, for example) should
   be used.  A source file can also be created to hold information
   about a package, including package annotations.  To create a
   source file for a named package, have name be the
   package's name followed by `.package-info`; to create a
   source file for an unnamed package, use `package-info`.

    Note that to use a particular java.nio.charset.charset to encode the contents of the
   file, an OutputStreamWriter with the chosen charset can
   be created from the OutputStream from the returned
   object. If the Writer from the returned object is
   directly used for writing, its charset is determined by the
   implementation.  An annotation processing tool may have an
   -encoding flag or analogous option for specifying this;
   otherwise, it will typically be the platform's default
   encoding.

   To avoid subsequent errors, the contents of the source file
   should be compatible with the source version being used
   for this run.

  name - canonical (fully qualified) name of the principal type being declared in this file or a package name followed by `.package-info` for a package information file - `java.lang.CharSequence`
  originating-elements - type or package elements causally associated with the creation of this file, may be elided or null - `javax.lang.model.element.Element`

  returns: a JavaFileObject to write the new source file - `javax.tools.JavaFileObject`

  throws: javax.annotation.processing.FilerException - if the same pathname has already been created, the same type has already been created, or the name is not valid for a type"
  ([^javax.annotation.processing.Filer this ^java.lang.CharSequence name ^javax.lang.model.element.Element originating-elements]
    (-> this (.createSourceFile name originating-elements))))

(defn create-class-file
  "Creates a new class file, and returns an object to allow
   writing to it.  The file's name and path (relative to the
   root output location
   for class files) are based on the name of the type being
   written.  A class file can also be created to hold information
   about a package, including package annotations.  To create a
   class file for a named package, have name be the
   package's name followed by `.package-info`; creating a
   class file for an unnamed package is not supported.

   To avoid subsequent errors, the contents of the class file
   should be compatible with the source version being used
   for this run.

  name - binary name of the type being written or a package name followed by `.package-info` for a package information file - `java.lang.CharSequence`
  originating-elements - type or package elements causally associated with the creation of this file, may be elided or null - `javax.lang.model.element.Element`

  returns: a JavaFileObject to write the new class file - `javax.tools.JavaFileObject`

  throws: javax.annotation.processing.FilerException - if the same pathname has already been created, the same type has already been created, or the name is not valid for a type"
  ([^javax.annotation.processing.Filer this ^java.lang.CharSequence name ^javax.lang.model.element.Element originating-elements]
    (-> this (.createClassFile name originating-elements))))

(defn create-resource
  "Creates a new auxiliary resource file for writing and returns a
   file object for it.  The file may be located along with the
   newly created source files, newly created binary files, or
   other supported location.  The locations CLASS_OUTPUT and SOURCE_OUTPUT must be
   supported.  The resource may be named relative to some package
   (as are source and class files), and from there by a relative
   pathname.  In a loose sense, the full pathname of the new file
   will be the concatenation of location, pkg, and
   relativeName.

   Files created via this method are not registered for
   annotation processing, even if the full pathname of the file
   would correspond to the full pathname of a new source file
   or new class file.

  location - location of the new file - `javax.tools.JavaFileManager.Location`
  pkg - package relative to which the file should be named, or the empty string if none - `java.lang.CharSequence`
  relative-name - final pathname components of the file - `java.lang.CharSequence`
  originating-elements - type or package elements causally associated with the creation of this file, may be elided or null - `javax.lang.model.element.Element`

  returns: a FileObject to write the new resource - `javax.tools.FileObject`

  throws: java.io.IOException - if the file cannot be created"
  ([^javax.annotation.processing.Filer this ^javax.tools.JavaFileManager.Location location ^java.lang.CharSequence pkg ^java.lang.CharSequence relative-name ^javax.lang.model.element.Element originating-elements]
    (-> this (.createResource location pkg relative-name originating-elements))))

(defn get-resource
  "Returns an object for reading an existing resource.  The
   locations CLASS_OUTPUT
   and SOURCE_OUTPUT must
   be supported.

  location - location of the file - `javax.tools.JavaFileManager.Location`
  pkg - package relative to which the file should be searched, or the empty string if none - `java.lang.CharSequence`
  relative-name - final pathname components of the file - `java.lang.CharSequence`

  returns: an object to read the file - `javax.tools.FileObject`

  throws: javax.annotation.processing.FilerException - if the same pathname has already been opened for writing"
  ([^javax.annotation.processing.Filer this ^javax.tools.JavaFileManager.Location location ^java.lang.CharSequence pkg ^java.lang.CharSequence relative-name]
    (-> this (.getResource location pkg relative-name))))


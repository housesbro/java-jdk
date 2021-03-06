(ns javax.swing.tree.VariableHeightLayoutCache
  "NOTE: This will become more open in a future release.

  Warning:
  Serialized objects of this class will not be compatible with
  future Swing releases. The current serialization support is
  appropriate for short term storage or RMI between applications running
  the same version of Swing.  As of 1.4, support for long term storage
  of all JavaBeans™
  has been added to the java.beans package.
  Please see XMLEncoder."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.tree VariableHeightLayoutCache]))

(defn ->variable-height-layout-cache
  "Constructor."
  (^VariableHeightLayoutCache []
    (new VariableHeightLayoutCache )))

(defn get-row-for-path
  "Returns the row where the last item identified in path is visible.
   Will return -1 if any of the elements in path are not
   currently visible.

  path - the TreePath of interest - `javax.swing.tree.TreePath`

  returns: the row where the last item in path is visible - `int`"
  (^Integer [^VariableHeightLayoutCache this ^javax.swing.tree.TreePath path]
    (-> this (.getRowForPath path))))

(defn tree-nodes-inserted
  "Invoked after nodes have been inserted into the tree.

   e.path returns the parent of the new nodes.
   e.childIndices returns the indices of the new nodes in
   ascending order.

  e - the TreeModelEvent of interest - `javax.swing.event.TreeModelEvent`"
  ([^VariableHeightLayoutCache this ^javax.swing.event.TreeModelEvent e]
    (-> this (.treeNodesInserted e))))

(defn tree-nodes-removed
  "Invoked after nodes have been removed from the tree.  Note that
   if a subtree is removed from the tree, this method may only be
   invoked once for the root of the removed subtree, not once for
   each individual set of siblings removed.

   e.path returns the former parent of the deleted nodes.

   e.childIndices returns the indices the nodes had
   before they were deleted in ascending order.

  e - the TreeModelEvent of interest - `javax.swing.event.TreeModelEvent`"
  ([^VariableHeightLayoutCache this ^javax.swing.event.TreeModelEvent e]
    (-> this (.treeNodesRemoved e))))

(defn expanded?
  "Returns true if the value identified by path is
   currently expanded.

  path - `javax.swing.tree.TreePath`

  returns: true if the value identified by path is
      currently expanded - `boolean`"
  (^Boolean [^VariableHeightLayoutCache this ^javax.swing.tree.TreePath path]
    (-> this (.isExpanded path))))

(defn get-row-count
  "Returns the number of visible rows.

  returns: the number of visible rows - `int`"
  (^Integer [^VariableHeightLayoutCache this]
    (-> this (.getRowCount))))

(defn set-root-visible
  "Determines whether or not the root node from
   the TreeModel is visible.

  root-visible - true if the root node of the tree is to be displayed - `boolean`"
  ([^VariableHeightLayoutCache this ^Boolean root-visible]
    (-> this (.setRootVisible root-visible))))

(defn set-node-dimensions
  "Sets the renderer that is responsible for drawing nodes in the tree.

  nd - the renderer - `javax.swing.tree.AbstractLayoutCache$NodeDimensions`"
  ([^VariableHeightLayoutCache this ^javax.swing.tree.AbstractLayoutCache$NodeDimensions nd]
    (-> this (.setNodeDimensions nd))))

(defn get-visible-child-count
  "Returns the number of visible children for path.

  path - the path being queried - `javax.swing.tree.TreePath`

  returns: the number of visible children for path - `int`"
  (^Integer [^VariableHeightLayoutCache this ^javax.swing.tree.TreePath path]
    (-> this (.getVisibleChildCount path))))

(defn tree-nodes-changed
  "Invoked after a node (or a set of siblings) has changed in some
   way. The node(s) have not changed locations in the tree or
   altered their children arrays, but other attributes have
   changed and may affect presentation. Example: the name of a
   file has changed, but it is in the same location in the file
   system.

   e.path returns the path the parent of the
   changed node(s).

   e.childIndices returns the index(es) of the
   changed node(s).

  e - the TreeModelEvent of interest - `javax.swing.event.TreeModelEvent`"
  ([^VariableHeightLayoutCache this ^javax.swing.event.TreeModelEvent e]
    (-> this (.treeNodesChanged e))))

(defn invalidate-path-bounds
  "Instructs the LayoutCache that the bounds for
   path are invalid, and need to be updated.

  path - the TreePath which is now invalid - `javax.swing.tree.TreePath`"
  ([^VariableHeightLayoutCache this ^javax.swing.tree.TreePath path]
    (-> this (.invalidatePathBounds path))))

(defn get-visible-paths-from
  "Returns an Enumerator that increments over the visible paths
   starting at the passed in location. The ordering of the enumeration
   is based on how the paths are displayed.

  path - the location in the TreePath to start - `javax.swing.tree.TreePath`

  returns: an Enumerator that increments over the visible
       paths - `java.util.Enumeration<javax.swing.tree.TreePath>`"
  (^java.util.Enumeration [^VariableHeightLayoutCache this ^javax.swing.tree.TreePath path]
    (-> this (.getVisiblePathsFrom path))))

(defn tree-structure-changed
  "Invoked after the tree has drastically changed structure from a
   given node down.  If the path returned by e.getPath
   is of length one and the first element does not identify the
   current root node the first element should become the new root
   of the tree.

   e.path holds the path to the node.
   e.childIndices returns null.

  e - the TreeModelEvent of interest - `javax.swing.event.TreeModelEvent`"
  ([^VariableHeightLayoutCache this ^javax.swing.event.TreeModelEvent e]
    (-> this (.treeStructureChanged e))))

(defn get-expanded-state?
  "Returns true if the path is expanded, and visible.

  path - the path being queried - `javax.swing.tree.TreePath`

  returns: true if the path is expanded and visible, otherwise false - `boolean`"
  (^Boolean [^VariableHeightLayoutCache this ^javax.swing.tree.TreePath path]
    (-> this (.getExpandedState path))))

(defn set-row-height
  "Sets the height of each cell.  If the specified value
   is less than or equal to zero the current cell renderer is
   queried for each row's height.

  row-height - the height of each cell, in pixels - `int`"
  ([^VariableHeightLayoutCache this ^Integer row-height]
    (-> this (.setRowHeight row-height))))

(defn get-path-for-row
  "Returns the path for row.  If row
   is not visible, null is returned.

  row - the location of interest - `int`

  returns: the path for row, or null
   if row is not visible - `javax.swing.tree.TreePath`"
  (^javax.swing.tree.TreePath [^VariableHeightLayoutCache this ^Integer row]
    (-> this (.getPathForRow row))))

(defn get-bounds
  "Returns the Rectangle enclosing the label portion
   into which the item identified by path will be drawn.

  path - the path to be drawn - `javax.swing.tree.TreePath`
  place-in - the bounds of the enclosing rectangle - `java.awt.Rectangle`

  returns: the bounds of the enclosing rectangle or null
      if the node could not be ascertained - `java.awt.Rectangle`"
  (^java.awt.Rectangle [^VariableHeightLayoutCache this ^javax.swing.tree.TreePath path ^java.awt.Rectangle place-in]
    (-> this (.getBounds path place-in))))

(defn set-expanded-state
  "Marks the path path expanded state to
   isExpanded.

  path - the TreePath of interest - `javax.swing.tree.TreePath`
  is-expanded - true if the path should be expanded, otherwise false - `boolean`"
  ([^VariableHeightLayoutCache this ^javax.swing.tree.TreePath path ^Boolean is-expanded]
    (-> this (.setExpandedState path is-expanded))))

(defn get-preferred-height
  "Returns the preferred height.

  returns: the preferred height - `int`"
  (^Integer [^VariableHeightLayoutCache this]
    (-> this (.getPreferredHeight))))

(defn set-model
  "Sets the TreeModel that will provide the data.

  new-model - the TreeModel that is to provide the data - `javax.swing.tree.TreeModel`"
  ([^VariableHeightLayoutCache this ^javax.swing.tree.TreeModel new-model]
    (-> this (.setModel new-model))))

(defn invalidate-sizes
  "Informs the TreeState that it needs to recalculate
   all the sizes it is referencing."
  ([^VariableHeightLayoutCache this]
    (-> this (.invalidateSizes))))

(defn get-path-closest-to
  "Returns the path to the node that is closest to x,y.  If
   there is nothing currently visible this will return null,
   otherwise it will always return a valid path.
   If you need to test if the
   returned object is exactly at x, y you should get the bounds for
   the returned path and test x, y against that.

  x - the x-coordinate - `int`
  y - the y-coordinate - `int`

  returns: the path to the node that is closest to x, y - `javax.swing.tree.TreePath`"
  (^javax.swing.tree.TreePath [^VariableHeightLayoutCache this ^Integer x ^Integer y]
    (-> this (.getPathClosestTo x y))))

(defn get-preferred-width
  "Returns the preferred width and height for the region in
   visibleRegion.

  bounds - the region being queried - `java.awt.Rectangle`

  returns: the preferred width for the passed in region - `int`"
  (^Integer [^VariableHeightLayoutCache this ^java.awt.Rectangle bounds]
    (-> this (.getPreferredWidth bounds))))


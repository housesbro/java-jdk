(ns javax.swing.table.TableColumnModel
  "Defines the requirements for a table column model object suitable for
  use with JTable."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.table TableColumnModel]))

(defn set-column-selection-allowed
  "Sets whether the columns in this model may be selected.

  flag - true if columns may be selected; otherwise false - `boolean`"
  ([^TableColumnModel this ^Boolean flag]
    (-> this (.setColumnSelectionAllowed flag))))

(defn get-column
  "Returns the TableColumn object for the column at
   columnIndex.

  column-index - the index of the desired column - `int`

  returns: the TableColumn object for
                            the column at columnIndex - `javax.swing.table.TableColumn`"
  (^javax.swing.table.TableColumn [^TableColumnModel this ^Integer column-index]
    (-> this (.getColumn column-index))))

(defn get-columns
  "Returns an Enumeration of all the columns in the model.

  returns: an Enumeration of all the columns in the model - `java.util.Enumeration<javax.swing.table.TableColumn>`"
  (^java.util.Enumeration [^TableColumnModel this]
    (-> this (.getColumns))))

(defn get-column-count
  "Returns the number of columns in the model.

  returns: the number of columns in the model - `int`"
  (^Integer [^TableColumnModel this]
    (-> this (.getColumnCount))))

(defn set-selection-model
  "Sets the selection model.

  new-model - a ListSelectionModel object - `javax.swing.ListSelectionModel`"
  ([^TableColumnModel this ^javax.swing.ListSelectionModel new-model]
    (-> this (.setSelectionModel new-model))))

(defn get-column-selection-allowed?
  "Returns true if columns may be selected.

  returns: true if columns may be selected - `boolean`"
  (^Boolean [^TableColumnModel this]
    (-> this (.getColumnSelectionAllowed))))

(defn remove-column
  "Deletes the TableColumn column from the
    tableColumns array.  This method will do nothing if
    column is not in the table's column list.
    This method posts a columnRemoved
    event to its listeners.

  column - the TableColumn to be removed - `javax.swing.table.TableColumn`"
  ([^TableColumnModel this ^javax.swing.table.TableColumn column]
    (-> this (.removeColumn column))))

(defn remove-column-model-listener
  "Removes a listener for table column model events.

  x - a TableColumnModelListener object - `javax.swing.event.TableColumnModelListener`"
  ([^TableColumnModel this ^javax.swing.event.TableColumnModelListener x]
    (-> this (.removeColumnModelListener x))))

(defn get-selection-model
  "Returns the current selection model.

  returns: a ListSelectionModel object - `javax.swing.ListSelectionModel`"
  (^javax.swing.ListSelectionModel [^TableColumnModel this]
    (-> this (.getSelectionModel))))

(defn get-selected-column-count
  "Returns the number of selected columns.

  returns: the number of selected columns; or 0 if no columns are selected - `int`"
  (^Integer [^TableColumnModel this]
    (-> this (.getSelectedColumnCount))))

(defn move-column
  "Moves the column and its header at columnIndex to
   newIndex.  The old column at columnIndex
   will now be found at newIndex.  The column that used
   to be at newIndex is shifted left or right
   to make room.  This will not move any columns if
   columnIndex equals newIndex.  This method
   posts a columnMoved event to its listeners.

  column-index - the index of column to be moved - `int`
  new-index - index of the column's new location - `int`

  throws: java.lang.IllegalArgumentException - if columnIndex or newIndex are not in the valid range"
  ([^TableColumnModel this ^Integer column-index ^Integer new-index]
    (-> this (.moveColumn column-index new-index))))

(defn add-column
  "Appends aColumn to the end of the
    tableColumns array.
    This method posts a columnAdded
    event to its listeners.

  a-column - the TableColumn to be added - `javax.swing.table.TableColumn`"
  ([^TableColumnModel this ^javax.swing.table.TableColumn a-column]
    (-> this (.addColumn a-column))))

(defn set-column-margin
  "Sets the TableColumn's column margin to
   newMargin.  This method posts
   a columnMarginChanged event to its listeners.

  new-margin - the width, in pixels, of the new column margins - `int`"
  ([^TableColumnModel this ^Integer new-margin]
    (-> this (.setColumnMargin new-margin))))

(defn get-column-margin
  "Returns the width between the cells in each column.

  returns: the margin, in pixels, between the cells - `int`"
  (^Integer [^TableColumnModel this]
    (-> this (.getColumnMargin))))

(defn get-selected-columns
  "Returns an array of indicies of all selected columns.

  returns: an array of integers containing the indicies of all
            selected columns; or an empty array if nothing is selected - `int[]`"
  ([^TableColumnModel this]
    (-> this (.getSelectedColumns))))

(defn get-total-column-width
  "Returns the total width of all the columns.

  returns: the total computed width of all columns - `int`"
  (^Integer [^TableColumnModel this]
    (-> this (.getTotalColumnWidth))))

(defn get-column-index-at-x
  "Returns the index of the column that lies on the
   horizontal point, xPosition;
   or -1 if it lies outside the any of the column's bounds.

   In keeping with Swing's separable model architecture, a
   TableColumnModel does not know how the table columns actually appear on
   screen.  The visual presentation of the columns is the responsibility
   of the view/controller object using this model (typically JTable).  The
   view/controller need not display the columns sequentially from left to
   right.  For example, columns could be displayed from right to left to
   accommodate a locale preference or some columns might be hidden at the
   request of the user.  Because the model does not know how the columns
   are laid out on screen, the given xPosition should not be
   considered to be a coordinate in 2D graphics space.  Instead, it should
   be considered to be a width from the start of the first column in the
   model.  If the column index for a given X coordinate in 2D space is
   required, JTable.columnAtPoint can be used instead.

  x-position - `int`

  returns: the index of the column; or -1 if no column is found - `int`"
  (^Integer [^TableColumnModel this ^Integer x-position]
    (-> this (.getColumnIndexAtX x-position))))

(defn add-column-model-listener
  "Adds a listener for table column model events.

  x - a TableColumnModelListener object - `javax.swing.event.TableColumnModelListener`"
  ([^TableColumnModel this ^javax.swing.event.TableColumnModelListener x]
    (-> this (.addColumnModelListener x))))

(defn get-column-index
  "Returns the index of the first column in the table
   whose identifier is equal to identifier,
   when compared using equals.

  column-identifier - the identifier object - `java.lang.Object`

  returns: the index of the first table column
                    whose identifier is equal to identifier - `int`

  throws: java.lang.IllegalArgumentException - if identifier is null, or no TableColumn has this identifier"
  (^Integer [^TableColumnModel this ^java.lang.Object column-identifier]
    (-> this (.getColumnIndex column-identifier))))


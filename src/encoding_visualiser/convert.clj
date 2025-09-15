(ns encoding-visualiser.convert
  (:gen-class))


(defn bitmap-to-bits
  "Converts a bitmap into bits. The bits'll be in the
  format MxNbbbbbbbbb..., where MxN is the size of the 
  bitmap matrix."
  [bitmap-matrix]
  (let [height (count bitmap-matrix)
        width (count (first bitmap-matrix))]
    {:width width
     :height height
     :bits (flatten bitmap-matrix)}))

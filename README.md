# simpleJsf

This project demonstrates a bug in the <p:column> component

The first three explicit <p:column> tags in index.xhtml works correctly. When you click on the filter in the header, only the rows having the desired values are filtered.

But when using the ones in the taglib, they don't work anymore. 
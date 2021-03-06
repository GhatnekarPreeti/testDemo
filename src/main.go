package main

	import (
 	   "archive/zip"
       	   "fmt"
           "path/filepath"
	
		)

		
func main(src string, dst string) ([]string, error) {
	fmt.Printf("Unzip dataset %s\n", src)
	var fileNames []string
	// Open zip file
	r, err := zip.OpenReader(src)
	if err != nil {
		return fileNames, err
	}
	defer r.Close()
	// Extract files
	for _, f := range r.File {
		// Open file
		filePath := filepath.Join(dst, f.Name)
fmt.println(filepath)
		}

}

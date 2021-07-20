import PyPDF2
file=open("E:/vs python/PDF/AccountStatement.pdf","rb")
reader = PyPDF2.PdfFileReader(file)

for i in range(reader.numPages):
    page=reader.getPage(i)
    print(page.extractText())


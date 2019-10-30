package gov.gtas.services;

import gov.gtas.services.dto.PdfDocumentRequest;
import gov.gtas.services.dto.PdfDocumentResponse;

public interface PassengerPdfService < R extends PdfDocumentRequest, S extends PdfDocumentResponse> {
	
	public S createPaxDetailReport(R pdfDocumentRequest) throws Exception;

}

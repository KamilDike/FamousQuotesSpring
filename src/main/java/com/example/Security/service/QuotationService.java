package com.example.Security.service;

import com.example.Security.exception.ResourceNotFoundException;
import com.example.Security.model.Quotation;
import com.example.Security.repository.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotationService {

    @Autowired
    private QuotationRepository quotationRepository;

    public List<Quotation> getQuotes() {
        System.out.println("geting quotes");
        System.out.println(quotationRepository.findAll().toString());
        return quotationRepository.findAll();
    }

    public ResponseEntity<Quotation> getQuote(Long id) throws ResourceNotFoundException {
        Quotation quotation = quotationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Quotation not found for this id: " + id));
        return ResponseEntity.ok().body(quotation);
    }

    public void add(Quotation quotation) {
        quotationRepository.save(quotation);
    }

    public void remove(Long id) throws ResourceNotFoundException {
        Quotation quotation = quotationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Quotation not found for this id: " + id));
        quotationRepository.delete(quotation);
    }
}

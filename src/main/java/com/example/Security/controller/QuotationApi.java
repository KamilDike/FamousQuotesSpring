package com.example.Security.controller;

import com.example.Security.exception.ResourceNotFoundException;
import com.example.Security.model.Quotation;
import com.example.Security.service.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuotationApi {

    @Autowired
    QuotationService quotationService;

    @GetMapping
    public List<Quotation> getQuotes() {
        return quotationService.getQuotes();
    }

    @GetMapping("{id}")
    public ResponseEntity<Quotation> getQuote(@PathVariable Long id) throws ResourceNotFoundException {
        return quotationService.getQuote(id);
    }

    @PostMapping
    public void addQuote(@RequestBody Quotation quotation) {
        quotationService.add(quotation);
    }

    @DeleteMapping("{id}")
    public void removeQuote(@PathVariable Long id) throws ResourceNotFoundException {
        quotationService.remove(id);
    }

    @PutMapping("{id}")
    public void updateQuote(@PathVariable Long id, @RequestBody Quotation quotation) throws ResourceNotFoundException {
        quotationService.remove(id);
        quotationService.add(quotation);
    }
}

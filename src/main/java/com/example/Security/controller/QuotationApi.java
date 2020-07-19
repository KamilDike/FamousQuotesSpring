package com.example.Security.controller;

import com.example.Security.model.Quotation;
import com.example.Security.service.QuotationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuotationApi {

    QuotationService quotationService;

    public QuotationApi(QuotationService quotationService) {
        this.quotationService = quotationService;
    }

    @GetMapping("/api")
    public List<Quotation> getQuotes() {
        return quotationService.getQuotes();
    }

    @PostMapping("/api")
    public Boolean addQuote(@RequestBody Quotation quotation) {
        return quotationService.add(quotation);
    }

    @DeleteMapping("/api")
    public void removeQuote(@RequestParam int id) {
        quotationService.remove(id);
    }
}

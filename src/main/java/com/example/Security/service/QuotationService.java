package com.example.Security.service;

import com.example.Security.model.Quotation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuotationService {
    List<Quotation> quotes;

    public QuotationService() {
        this.quotes = new ArrayList<>();
        Quotation q1 = new Quotation("Nelson Mandela",
                "The greatest glory in living lies not in never falling, but in rising every time we fall.");
        Quotation q2 = new Quotation("Walt Disney",
                "The way to get started is to quit talking and begin doing.");
        Quotation q3 = new Quotation("Steve Jobs",
                "Your time is limited, so don't waste it living someone else's life. " +
                        "Don't be trapped by dogma – which is living with the results of other people's thinking.");
        Quotation q4 = new Quotation("John Lennon",
                "Life is what happens when you're busy making other plans.");
        this.quotes.addAll(List.of(q1, q2, q3, q4));
    }

    public List<Quotation> getQuotes() {
        return quotes;
    }

    public Boolean add(Quotation quotation) {
        return quotes.add(quotation);
    }

    public void remove(int id) {
        quotes.remove(id);
    }
}

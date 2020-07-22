package com.example.Security.service;

import com.example.Security.model.Quotation;
import com.example.Security.repository.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Initialize {
    @Autowired
    private QuotationRepository quotationRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void loadDB() {
        if (quotationRepository.count() == 0) {
            Quotation q1 = new Quotation("Nelson Mandela",
                    "The greatest glory in living lies not in never falling, but in rising every time we fall.");
            Quotation q2 = new Quotation("Walt Disney",
                    "The way to get started is to quit talking and begin doing.");
            Quotation q3 = new Quotation("Steve Jobs",
                    "Your time is limited, so don't waste it living someone else's life. " +
                            "Don't be trapped by dogma – which is living with the results of other people's thinking.");
            Quotation q4 = new Quotation("John Lennon",
                    "Life is what happens when you're busy making other plans.");
            quotationRepository.saveAll(Arrays.asList(q1, q2, q3, q4));
        }
    }
}

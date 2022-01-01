package com.example.demo.service.document;


import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;

    @Override
    public Document addDocument(Document document) {
        return documentRepository.save(document);
    }

    @Override
    public void deleteDocument(long id) {
        documentRepository.deleteById(id);
    }

    @Override
    public List<Document> getDocuments() {
        return documentRepository.findAll();
    }

    @Override
    public void updateDocument(Document document) {
        documentRepository.save(document);
    }

    @Override
    public Optional<Document> getDocument(long id) {
        return documentRepository.findById(id);
    }
}

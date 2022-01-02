package com.example.demo.service.document;




import com.example.demo.model.Document;

import java.util.List;
import java.util.Optional;

public interface DocumentService {


    Document addDocument(Document document);

    void deleteDocument(long id);

    List<Document> getDocuments();

    void updateDocument(Document document);

    Optional<Document> getDocument(long id);
}

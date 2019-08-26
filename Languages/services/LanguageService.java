package services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import models.Language;
import repositories.Repository;

@Service
public class LanguageService {
	private Repository Repository;

    public LanguageService(Repository Repository){
        this.Repository = Repository;
    }
    
    public List<Language> allLangs() {
        return (List<Language>) Repository.findAll();
    }
    
    public void addLang(Language lang) {
    		Repository.save(lang);
    }
    
    public Optional<Language> findLangById(Long id) {
    		return Repository.findById(id);
    }
    
    public void updateLang(Language lang) {
    		Repository.save(lang);
    }
    
    public void deleteLang(Long id) {
    		Repository.deleteById(id);
    }
}
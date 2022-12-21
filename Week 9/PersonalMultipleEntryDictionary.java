package com.Week9.mooc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
        private Map<String, Set<String>> dictionary;

        public PersonalMultipleEntryDictionary(){
            dictionary = new HashMap<String, Set<String>>();
        }

        public void add(String word, String translation){
            if (!this.dictionary.containsKey(word)) {
                this.dictionary.put(word, new HashSet<String>());
            }

            Set<String> wordSet = this.dictionary.get(word);
            wordSet.add(translation);
        }

        public Set<String> translate(String word){
            return this.dictionary.get(word);
        }

        public void remove(String word){
            this.dictionary.remove(word);
        }

}


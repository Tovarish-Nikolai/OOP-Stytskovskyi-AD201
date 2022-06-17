package com.mycompany.lab.stytskovskyi;

import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;

public class PrimaryController 
{
    private String noun;
    private String verb;
    private String adverb;
    private String inputString;
    
    @FXML
    private ChoiceBox<String> adverbSelect;
    @FXML
    private ChoiceBox<String> pronounSelect;
    @FXML
    private RadioButton radioAdverb;
    @FXML
    private RadioButton radioNoun;
    @FXML
    private RadioButton radioParticle;
    @FXML
    private TextField textInput;
    @FXML
    private Label textOutput;

    @FXML
    public void execute (ActionEvent event)
    {     
            textOutput.setText("");
            noun = "";
            verb = "";
            adverb = "";
            inputString = "";
            
            inputString = textInput.getText();
            for (int i = 0, j = 1; i < inputString.length(); i++) {
                if (inputString.charAt(i) == ' ') {
                    j++;
                    continue;
                }
                if (j == 1)
                    noun += inputString.charAt(i);

                if (j == 2)
                    verb += inputString.charAt(i);
                if (j == 3)
                    adverb += inputString.charAt(i);
            }        

        if (radioNoun.isSelected()==true)
        {
            noun = pronounSelect.getValue();
            
            if ("Она".equals(pronounSelect.getValue()))
            {
                verb += 'a';
            }
            else if ("Они".equals(pronounSelect.getValue()))
            {
                verb += 'и';
            }
            
        }
        
        if (radioParticle.isSelected() == true)
        {
            verb += " бы";
        }
                
        
        if (radioAdverb.isSelected() == true)
        {
            adverb = adverbSelect.getValue();
        }
        
        
        textOutput.setText(noun + ' ' + verb + ' ' + adverb);
    }
    
    @FXML
    void enableAdverbSelect(ActionEvent event) 
    {
        adverbSelect.disableProperty().set((adverbSelect.disableProperty().get() != true));
    }

    @FXML
    void enablePronounSelect(ActionEvent event) 
    {
        pronounSelect.disableProperty().set((pronounSelect.disableProperty().get() != true));
    }
        
    @FXML
    public void pronounFill(MouseEvent event)
    {
        if (pronounSelect.getItems().size() < 2)
            pronounSelect.getItems().addAll("Он", "Она", "Они");
    }    
    
    @FXML
    public void adverbFill(MouseEvent event)
    {
        if (adverbSelect.getItems().size() < 2)
            adverbSelect.getItems().addAll("здесь", "везде", "нигде", "зачем?", "почему?");
    }       
    
    @FXML
    public void clearInput(ActionEvent event)
    {
        textInput.clear();
        textOutput.setText("");
    }
}

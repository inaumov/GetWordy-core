package get.wordy.core.api;

import get.wordy.core.bean.Card;
import get.wordy.core.bean.Dictionary;
import get.wordy.core.bean.wrapper.CardStatus;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IDictionaryService {

    List<Dictionary> getDictionaries();

    Dictionary createDictionary(final String dictionaryName);

    boolean removeDictionary(final String dictionaryName);

    boolean renameDictionary(final String oldDictionaryName, final String newDictionaryName);

    Map<String, Card> getCards(String dictionaryName);

    Map<String, Card> getCardsForExercise(String dictionaryName, final int amount);

    boolean saveOrUpdateCard(Card card, String dictionaryName);

    boolean removeCard(final String word);

    Card loadCard(final String word);

    boolean changeStatus(final String word, CardStatus updatedStatus);

    IScore getScore(final String dictionaryName);

    boolean resetScore(String dictionaryName);

    boolean increaseScoreUp(final String word, int repetitions);

    boolean generateCards(Set<String> words);

}
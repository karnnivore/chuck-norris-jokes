package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    //init chuckNorrisQuotes
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    //return random joke
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}

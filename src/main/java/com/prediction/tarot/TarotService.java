package com.prediction.tarot;


import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
@Service
public class TarotService {
    private final List<TarotCard> deck;
    public TarotService() {
        deck = new ArrayList<>();
        deck.add(new TarotCard("The Fool", "New beginnings, adventure, and innocence."));
        deck.add(new TarotCard("The Magician", "Power, skill, and concentration."));
        deck.add(new TarotCard("The High Priestess","Intuition, mystery, inner wisdom, subconscious."));
        deck.add(new TarotCard("The Empress","Nurturing, abundance, fertility, motherhood."));
                deck.add(new TarotCard(" The Emperor","Authority, structure, stability, leadership."));
                deck.add(new TarotCard(" The Hierophant","Tradition, conformity, spiritual guidance, institutions."));
        deck.add(new TarotCard(" The Lovers","Love, harmony, partnership, choices."));
        deck.add(new TarotCard(" The Chariot","Willpower, determination, triumph over obstacles."));
                deck.add(new TarotCard(" Strength","Courage, inner strength, patience, resilience."));
        deck.add(new TarotCard(" The Hermit","Introspection, solitude, inner guidance, wisdom."));
        deck.add(new TarotCard("Wheel of Fortune"," Luck, cycles, destiny, change."));
                deck.add(new TarotCard("Justice","Fairness, balance, truth, accountability."));
                deck.add(new TarotCard("The Hanged Man","Letting go, surrender, new perspectives, sacrifice."));
        deck.add(new TarotCard("Death","Transformation, endings, new beginnings, transition."));
        deck.add(new TarotCard("Temperance","Balance, moderation, patience, harmony."));
                deck.add(new TarotCard("The Devil","Temptation, addiction, materialism, bondage."));
        deck.add(new TarotCard("The Tower","Sudden upheaval, chaos, revelation, destruction."));
        deck.add(new TarotCard("The Star","Hope, inspiration, healing, renewal."));
        deck.add(new TarotCard("The Moon","Illusion, intuition, subconscious, confusion."));
        deck.add(new TarotCard("The Sun","Joy, success, vitality, enlightenment."));
        deck.add(new TarotCard("Judgment","Reflection, reckoning, awakening, decision."));
                deck.add(new TarotCard("The World","Completion, accomplishment, unity, fulfillment."));
        deck.add(new TarotCard("Ace of Wands","New beginnings, inspiration, creativity."));
                deck.add(new TarotCard("Two of Wands","Planning, decisions, progress."));
                deck.add(new TarotCard(" Three of Wands","Expansion, foresight, exploration."));
        deck.add(new TarotCard("Four of Wands","Celebration, harmony, homecoming."));
                deck.add(new TarotCard("Five of Wands","Conflict, competition, struggle."));
        deck.add(new TarotCard("Six of Wands","Victory, recognition, success."));
                deck.add(new TarotCard("Seven of Wands","Challenge, perseverance, defense."));
                deck.add(new TarotCard("Eight of Wands","Speed, action, movement."));
        deck.add(new TarotCard("Nine of Wands","Resilience, protection, endurance."));
                deck.add(new TarotCard("Ten of Wands","Burden, responsibility, overload."));
        deck.add(new TarotCard("Page of Wands","Enthusiasm, exploration, messages."));
                deck.add(new TarotCard(" Knight of Wands","Adventure, action, ambition."));
                deck.add(new TarotCard(" Queen of Wands","Confidence, passion, creativity."));
        deck.add(new TarotCard("King of Wands","Leadership, vision, entrepreneurship."));
        deck.add(new TarotCard("Ace of Cups","New emotions, love, intuition."));
        deck.add(new TarotCard("Two of Cups","Partnership, unity, mutual respect."));
                deck.add(new TarotCard("Three of Cups","Celebration, friendship, joy."));
        deck.add(new TarotCard(" Four of Cups","Contemplation, apathy, discontent."));
        deck.add(new TarotCard("Five of Cups","Loss, grief, regret."));
        deck.add(new TarotCard("Six of Cups","Nostalgia, childhood, memories."));
        deck.add(new TarotCard("Seven of Cups","Choices, illusions, dreams."));
                deck.add(new TarotCard("Eight of Cups","Abandonment, seeking deeper meaning, change."));
                deck.add(new TarotCard("Nine of Cups","Satisfaction, contentment, wishes fulfilled."));
                deck.add(new TarotCard("Ten of Cups","Happiness, family, harmony."));
        deck.add(new TarotCard("Page of Cups","Creativity, emotional messages, intuition."));
        deck.add(new TarotCard("Knight of Cups","Romance, idealism, charm."));
                deck.add(new TarotCard(" Queen of Cups","Empathy, compassion, emotional stability."));
        deck.add(new TarotCard("King of Cups","Emotional maturity, wisdom, balance."));
        deck.add(new TarotCard("Ace of Swords","Clarity, truth, new ideas."));
        deck.add(new TarotCard("Two of Swords","Indecision, balance, choices."));
                deck.add(new TarotCard("Three of Swords","Heartbreak, sorrow, separation."));
                deck.add(new TarotCard("Four of Swords","Rest, recovery, contemplation."));
                deck.add(new TarotCard("Five of Swords","Conflict, loss, tension."));
                deck.add(new TarotCard("Six of Swords","Transition, moving on, healing."));
                deck.add(new TarotCard("Seven of Swords","Deception, strategy, stealth."));
        deck.add(new TarotCard("Eight of Swords","Restriction, confusion, feeling trapped."));
                deck.add(new TarotCard("Nine of Swords","Anxiety, nightmares, worry."));
                deck.add(new TarotCard("Ten of Swords","Ruin, betrayal, hitting rock bottom."));
                deck.add(new TarotCard("Page of Swords","Curiosity, vigilance, communication."));
                deck.add(new TarotCard("Knight of Swords","Action, ambition, assertiveness."));
        deck.add(new TarotCard("Queen of Swords","Independence, intellect, clarity."));
                deck.add(new TarotCard("King of Swords","Authority, logic, fairness."));
        deck.add(new TarotCard("Ace of Pentacles","Prosperity, new opportunities, material gain."));
        deck.add(new TarotCard("Two of Pentacles","Balance, adaptability, juggling."));
        deck.add(new TarotCard("Three of Pentacles","Teamwork, skill, craftsmanship."));
                deck.add(new TarotCard("Four of Pentacles","Security, control, possessiveness."));
        deck.add(new TarotCard("Five of Pentacles","Poverty, hardship, exclusion."));
                deck.add(new TarotCard("Six of Pentacles","Generosity, charity, balance of giving and receiving."));
        deck.add(new TarotCard("Seven of Pentacles","Patience, assessment, long-term results."));
        deck.add(new TarotCard("Eight of Pentacles","Diligence, mastery, hard work."));
        deck.add(new TarotCard("Nine of Pentacles","Abundance, self-sufficiency, luxury."));
                deck.add(new TarotCard("Ten of Pentacles","Legacy, family, wealth, inheritance."));
        deck.add(new TarotCard("Page of Pentacles","New ventures, practicalities, study."));
        deck.add(new TarotCard("Knight of Pentacles","Reliability, hard work, persistence."));
                deck.add(new TarotCard("Queen of Pentacles","Nurturance, practicality, abundance."));
        deck.add(new TarotCard("King of Pentacles","Wealth, success, authority."));
        Collections.shuffle(deck); // Shuffle the deck initially
    }
    public TarotCard drawCard() {
        Random rand = new Random();
        return deck.get(rand.nextInt(deck.size()));
    }
}
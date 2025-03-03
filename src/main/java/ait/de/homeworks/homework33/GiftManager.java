package ait.de.homeworks.homework33;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class GiftManager {
    private List<Gift> gifts = new ArrayList<>();

    public void addGift(Gift gift) {
        if (gift == null) {
            log.warn("Gift is null");
        } else {
            gifts.add(gift);
            log.info("Gift was added: " + gift.getName());
        }
    }

    public List<Gift> filterByCategory(GiftCategory category) {
        List<Gift> filteredGifts = new ArrayList<>();
        for (Gift gift : gifts) {
            if (gift.getCategory() == category) {
                filteredGifts.add(gift);
            }
        }
        return filteredGifts;
    }

    public boolean updateGiftStatus(String giftName, GiftStatus newStatus) {
        if (giftName == null || newStatus == null || giftName.isEmpty()) {
            log.error("Status update is not possible. Gift: {}, Status {}", giftName, newStatus);
            return false;
        } else {
            for (Gift gift : gifts) {
                if (gift.getName().equalsIgnoreCase(giftName)) {
                    gift.setStatus(newStatus);
                    log.info("Status of gift {} was update to {}", giftName, newStatus);
                }
            }
        }
        return true;
    }

    public List<Gift> getGifts() {
        return gifts;
    }
}

package org.steve.hockeyware.features.module.modules;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.steve.hockeyware.features.module.Category;
import org.steve.hockeyware.features.module.Module;
import org.steve.hockeyware.setting.Setting;
import org.steve.hockeyware.util.client.ClientMessage;
import org.steve.hockeyware.util.client.InventoryUtil;

public class ChestSwap extends Module {
    public static final Setting<Boolean> chat = new Setting<>("ChatAnnounce", true);

    public ChestSwap() {
        super("ChestSwap", "Allows you to switch between elytra and chestplate", Category.Player);
    }

    @Override
    public void onEnable() {
        ItemStack itemStack = InventoryUtil.getItemStack(38);
        assert itemStack != null;
        if (itemStack.getItem() == Items.ELYTRA) {
            int slot = getChestPlateSlot();
            if (slot != -1) {
                InventoryUtil.clickSlot(slot);
                InventoryUtil.clickSlot(38);
                InventoryUtil.clickSlot(slot);
                if (chat.getValue()) {
                    ClientMessage.sendOverwriteClientMessage("Switched to Chestplate");
                }
            } else {
                ClientMessage.sendMessage("No Chestplate was found in inventory", true);
            }
        } else if (InventoryUtil.getItemCount(Items.ELYTRA, true) != 0) {
            int slot = InventoryUtil.getItemSlot(Items.ELYTRA);
            InventoryUtil.clickSlot(slot);
            InventoryUtil.clickSlot(38);
            InventoryUtil.clickSlot(slot);
            if (chat.getValue()) {
                ClientMessage.sendOverwriteClientMessage("Switched to Elytra");
            }
        } else {
            ClientMessage.sendMessage("No Elytra was found in inventory", true);
        }
        this.toggle(true);
    }

    public int getChestPlateSlot() {
        Item[] items = {Items.DIAMOND_CHESTPLATE, Items.CHAINMAIL_CHESTPLATE, Items.IRON_CHESTPLATE, Items.GOLDEN_CHESTPLATE, Items.LEATHER_CHESTPLATE};

        for (Item item : items) {
            if (InventoryUtil.getItemCount(item, true) != 0) {
                return InventoryUtil.getItemSlot(item);
            }
        }
        return -1;
    }
}


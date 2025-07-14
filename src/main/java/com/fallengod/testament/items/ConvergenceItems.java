package com.fallengod.testament.items;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.Arrays;

public class ConvergenceItems {
    
    public static final NamespacedKey NEXUS_CROWN_KEY = new NamespacedKey("fallengod", "nexus_crown");
    public static final NamespacedKey OMNIPOTENT_SCEPTER_KEY = new NamespacedKey("fallengod", "omnipotent_scepter");
    public static final NamespacedKey DIVINE_CODEX_KEY = new NamespacedKey("fallengod", "divine_codex");
    
    public static ItemStack createNexusCrown() {
        ItemStack crown = new ItemStack(Material.NETHERITE_HELMET);
        ItemMeta meta = crown.getItemMeta();
        
        if (meta != null) {
            meta.setDisplayName("§6§l✦ Crown of Divine Convergence ✦");
            meta.setLore(Arrays.asList(
                "§7The ultimate symbol of divine mastery,",
                "§7worn only by those who have united",
                "§7all twelve fallen gods under one will.",
                "",
                "§6§lEffects:",
                "§7• All Testament Powers Combined",
                "§7• +20 Hearts (30 total)",
                "§7• Immunity to All Damage Types",
                "§7• Flight (Creative Mode)",
                "§7• Infinite Resources",
                "§7• Reality Manipulation",
                "",
                "§8§l\"I am become Death, destroyer of worlds.\"",
                "§8§l\"I am become Life, creator of realms.\"",
                "",
                "§6§lCONVERGENCE NEXUS REWARD"
            ));
            
            // Ultimate enchantments
            meta.addEnchant(Enchantment.PROTECTION, 10, true);
            meta.addEnchant(Enchantment.FIRE_PROTECTION, 10, true);
            meta.addEnchant(Enchantment.PROJECTILE_PROTECTION, 10, true);
            meta.addEnchant(Enchantment.BLAST_PROTECTION, 10, true);
            meta.addEnchant(Enchantment.UNBREAKING, 20, true);
            meta.addEnchant(Enchantment.MENDING, 5, true);
            meta.addEnchant(Enchantment.RESPIRATION, 10, true);
            meta.addEnchant(Enchantment.AQUA_AFFINITY, 5, true);
            
            meta.getPersistentDataContainer().set(NEXUS_CROWN_KEY, PersistentDataType.BOOLEAN, true);
            meta.setEnchantmentGlintOverride(true);
            meta.setCustomModelData(100100); // Special model data for crown
            
            crown.setItemMeta(meta);
        }
        
        return crown;
    }
    
    public static ItemStack createOmnipotentScepter() {
        ItemStack scepter = new ItemStack(Material.STICK);
        ItemMeta meta = scepter.getItemMeta();
        
        if (meta != null) {
            meta.setDisplayName("§d§l⚡ Scepter of Omnipotence ⚡");
            meta.setLore(Arrays.asList(
                "§7A weapon that transcends all others,",
                "§7forged from the essence of twelve gods.",
                "",
                "§d§lAbilities:",
                "§7• Right-click: Divine Judgment",
                "§7• Sneak + Right-click: Reality Warp",
                "§7• Attack: Omnislash (1000 damage)",
                "§7• Passive: All Weapon Abilities",
                "",
                "§8\"With this scepter, I command the very\"",
                "§8\"fabric of existence itself.\"",
                "",
                "§6§lCONVERGENCE NEXUS REWARD"
            ));
            
            // Ultimate weapon enchantments
            meta.addEnchant(Enchantment.SHARPNESS, 20, true);
            meta.addEnchant(Enchantment.UNBREAKING, 50, true);
            meta.addEnchant(Enchantment.MENDING, 10, true);
            meta.addEnchant(Enchantment.FIRE_ASPECT, 10, true);
            meta.addEnchant(Enchantment.KNOCKBACK, 5, true);
            meta.addEnchant(Enchantment.LOOTING, 10, true);
            
            meta.getPersistentDataContainer().set(OMNIPOTENT_SCEPTER_KEY, PersistentDataType.BOOLEAN, true);
            meta.setEnchantmentGlintOverride(true);
            meta.setCustomModelData(100101); // Special model data for scepter
            
            scepter.setItemMeta(meta);
        }
        
        return scepter;
    }
    
    public static ItemStack createDivineCodex() {
        ItemStack codex = new ItemStack(Material.WRITTEN_BOOK);
        ItemMeta meta = codex.getItemMeta();
        
        if (meta != null) {
            meta.setDisplayName("§b§l📖 Divine Codex of All Knowledge 📖");
            meta.setLore(Arrays.asList(
                "§7The complete knowledge of all twelve",
                "§7fallen gods, their powers, and the",
                "§7secrets of divine convergence.",
                "",
                "§b§lContains:",
                "§7• All God Lore and Histories",
                "§7• Testament Completion Guides",
                "§7• Divine Power Combinations",
                "§7• Reality Manipulation Techniques",
                "§7• The True Names of the Gods",
                "",
                "§8\"Knowledge is the ultimate power.\"",
                "",
                "§6§lCONVERGENCE NEXUS REWARD"
            ));
            
            meta.addEnchant(Enchantment.UNBREAKING, 10, true);
            meta.getPersistentDataContainer().set(DIVINE_CODEX_KEY, PersistentDataType.BOOLEAN, true);
            meta.setEnchantmentGlintOverride(true);
            meta.setCustomModelData(100102); // Special model data for codex
            
            codex.setItemMeta(meta);
        }
        
        return codex;
    }
    
    public static boolean isNexusCrown(ItemStack item) {
        if (item == null || !item.hasItemMeta()) {
            return false;
        }
        ItemMeta meta = item.getItemMeta();
        return meta.getPersistentDataContainer().has(NEXUS_CROWN_KEY, PersistentDataType.BOOLEAN);
    }
    
    public static boolean isOmnipotentScepter(ItemStack item) {
        if (item == null || !item.hasItemMeta()) {
            return false;
        }
        ItemMeta meta = item.getItemMeta();
        return meta.getPersistentDataContainer().has(OMNIPOTENT_SCEPTER_KEY, PersistentDataType.BOOLEAN);
    }
    
    public static boolean isDivineCodex(ItemStack item) {
        if (item == null || !item.hasItemMeta()) {
            return false;
        }
        ItemMeta meta = item.getItemMeta();
        return meta.getPersistentDataContainer().has(DIVINE_CODEX_KEY, PersistentDataType.BOOLEAN);
    }
    
    public static boolean isConvergenceItem(ItemStack item) {
        return isNexusCrown(item) || isOmnipotentScepter(item) || isDivineCodex(item);
    }
}
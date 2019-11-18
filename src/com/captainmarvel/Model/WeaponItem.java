package com.captainmarvel.Model;

public class WeaponItem extends Item
{
	private int itemSize;
	private int attackBonus;

	public WeaponItem(String itemID, String itemName, String itemDescription, int itemSize, int attackBonus)
	{
		super(itemID, itemName, itemDescription);
		this.itemSize = itemSize;
		this.attackBonus = attackBonus;
	}

	public int getItemSize()
	{
		return itemSize;
	}

	public void setItemSize(int itemSize)
	{
		this.itemSize = itemSize;
	}

	public int getAttackBonus()
	{
		return attackBonus;
	}

	public void setAttackBonus(int attackBonus)
	{
		this.attackBonus = attackBonus;
	}

	private int damagePoints;

	public int getDamagePoints()
	{
		return damagePoints;
	}

	public void setDamagePoints(int damagePoints)
	{
		this.damagePoints = damagePoints;
	}
}
package com.Encouragement;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("encouragement")
public interface EncouragementConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Frequency",
		description = "How frequent will the messages pop up"
	)
	default String greeting()
	{
		return "This is a test";
	}
}

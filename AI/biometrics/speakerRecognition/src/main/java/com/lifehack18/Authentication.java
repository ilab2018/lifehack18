package com.lifehack18;

/**
 * 
 * @author Patrick Pan
 *
 */
public class Authentication {

	public static final String SUBSCRIPTION_KEY = "*** Subscription Key ***";

	public enum IdentificationProfile {

		PATRICK("*** Patrick Id ***"), 
		CAESAR("*** Caesar Id ***"), 
		TOM("*** Glory Id ***"),
		GEORGIO("*** Georgio Id ***");

		private String profileId;

		private IdentificationProfile(String profileId) {
			this.profileId = profileId;
		}

		public String getProfileId() {
			return profileId;
		}
	}
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserSettings extends Entity implements Parsable {
    /**
     * The user's settings for the visibility of merge suggestion for the duplicate contacts in the user's contact list.
     */
    private ContactMergeSuggestions contactMergeSuggestions;
    /**
     * Reflects the Office Delve organization level setting. When set to true, the organization doesn't have access to Office Delve. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     */
    private Boolean contributionToContentDiscoveryAsOrganizationDisabled;
    /**
     * When set to true, documents in the user's Office Delve are disabled. Users can control this setting in Office Delve.
     */
    private Boolean contributionToContentDiscoveryDisabled;
    /**
     * The user's settings for the visibility of meeting hour insights, and insights derived between a user and other items in Microsoft 365, such as documents or sites. Get userInsightsSettings through this navigation property.
     */
    private UserInsightsSettings itemInsights;
    /**
     * The user's preferences for languages, regional locale and date/time formatting.
     */
    private RegionalAndLanguageSettings regionalAndLanguageSettings;
    /**
     * The shift preferences for the user.
     */
    private ShiftPreferences shiftPreferences;
    /**
     * Instantiates a new userSettings and sets the default values.
     */
    public UserSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSettings
     */
    @jakarta.annotation.Nonnull
    public static UserSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSettings();
    }
    /**
     * Gets the contactMergeSuggestions property value. The user's settings for the visibility of merge suggestion for the duplicate contacts in the user's contact list.
     * @return a contactMergeSuggestions
     */
    @jakarta.annotation.Nullable
    public ContactMergeSuggestions getContactMergeSuggestions() {
        return this.contactMergeSuggestions;
    }
    /**
     * Gets the contributionToContentDiscoveryAsOrganizationDisabled property value. Reflects the Office Delve organization level setting. When set to true, the organization doesn't have access to Office Delve. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContributionToContentDiscoveryAsOrganizationDisabled() {
        return this.contributionToContentDiscoveryAsOrganizationDisabled;
    }
    /**
     * Gets the contributionToContentDiscoveryDisabled property value. When set to true, documents in the user's Office Delve are disabled. Users can control this setting in Office Delve.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContributionToContentDiscoveryDisabled() {
        return this.contributionToContentDiscoveryDisabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contactMergeSuggestions", (n) -> { this.setContactMergeSuggestions(n.getObjectValue(ContactMergeSuggestions::createFromDiscriminatorValue)); });
        deserializerMap.put("contributionToContentDiscoveryAsOrganizationDisabled", (n) -> { this.setContributionToContentDiscoveryAsOrganizationDisabled(n.getBooleanValue()); });
        deserializerMap.put("contributionToContentDiscoveryDisabled", (n) -> { this.setContributionToContentDiscoveryDisabled(n.getBooleanValue()); });
        deserializerMap.put("itemInsights", (n) -> { this.setItemInsights(n.getObjectValue(UserInsightsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("regionalAndLanguageSettings", (n) -> { this.setRegionalAndLanguageSettings(n.getObjectValue(RegionalAndLanguageSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("shiftPreferences", (n) -> { this.setShiftPreferences(n.getObjectValue(ShiftPreferences::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemInsights property value. The user's settings for the visibility of meeting hour insights, and insights derived between a user and other items in Microsoft 365, such as documents or sites. Get userInsightsSettings through this navigation property.
     * @return a userInsightsSettings
     */
    @jakarta.annotation.Nullable
    public UserInsightsSettings getItemInsights() {
        return this.itemInsights;
    }
    /**
     * Gets the regionalAndLanguageSettings property value. The user's preferences for languages, regional locale and date/time formatting.
     * @return a regionalAndLanguageSettings
     */
    @jakarta.annotation.Nullable
    public RegionalAndLanguageSettings getRegionalAndLanguageSettings() {
        return this.regionalAndLanguageSettings;
    }
    /**
     * Gets the shiftPreferences property value. The shift preferences for the user.
     * @return a shiftPreferences
     */
    @jakarta.annotation.Nullable
    public ShiftPreferences getShiftPreferences() {
        return this.shiftPreferences;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contactMergeSuggestions", this.getContactMergeSuggestions());
        writer.writeBooleanValue("contributionToContentDiscoveryAsOrganizationDisabled", this.getContributionToContentDiscoveryAsOrganizationDisabled());
        writer.writeBooleanValue("contributionToContentDiscoveryDisabled", this.getContributionToContentDiscoveryDisabled());
        writer.writeObjectValue("itemInsights", this.getItemInsights());
        writer.writeObjectValue("regionalAndLanguageSettings", this.getRegionalAndLanguageSettings());
        writer.writeObjectValue("shiftPreferences", this.getShiftPreferences());
    }
    /**
     * Sets the contactMergeSuggestions property value. The user's settings for the visibility of merge suggestion for the duplicate contacts in the user's contact list.
     * @param value Value to set for the contactMergeSuggestions property.
     */
    public void setContactMergeSuggestions(@jakarta.annotation.Nullable final ContactMergeSuggestions value) {
        this.contactMergeSuggestions = value;
    }
    /**
     * Sets the contributionToContentDiscoveryAsOrganizationDisabled property value. Reflects the Office Delve organization level setting. When set to true, the organization doesn't have access to Office Delve. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     * @param value Value to set for the contributionToContentDiscoveryAsOrganizationDisabled property.
     */
    public void setContributionToContentDiscoveryAsOrganizationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.contributionToContentDiscoveryAsOrganizationDisabled = value;
    }
    /**
     * Sets the contributionToContentDiscoveryDisabled property value. When set to true, documents in the user's Office Delve are disabled. Users can control this setting in Office Delve.
     * @param value Value to set for the contributionToContentDiscoveryDisabled property.
     */
    public void setContributionToContentDiscoveryDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.contributionToContentDiscoveryDisabled = value;
    }
    /**
     * Sets the itemInsights property value. The user's settings for the visibility of meeting hour insights, and insights derived between a user and other items in Microsoft 365, such as documents or sites. Get userInsightsSettings through this navigation property.
     * @param value Value to set for the itemInsights property.
     */
    public void setItemInsights(@jakarta.annotation.Nullable final UserInsightsSettings value) {
        this.itemInsights = value;
    }
    /**
     * Sets the regionalAndLanguageSettings property value. The user's preferences for languages, regional locale and date/time formatting.
     * @param value Value to set for the regionalAndLanguageSettings property.
     */
    public void setRegionalAndLanguageSettings(@jakarta.annotation.Nullable final RegionalAndLanguageSettings value) {
        this.regionalAndLanguageSettings = value;
    }
    /**
     * Sets the shiftPreferences property value. The shift preferences for the user.
     * @param value Value to set for the shiftPreferences property.
     */
    public void setShiftPreferences(@jakarta.annotation.Nullable final ShiftPreferences value) {
        this.shiftPreferences = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSettings extends Entity implements Parsable {
    /** The user's settings for the visibility of merge suggestion for the duplicate contacts in the user's contact list. */
    private ContactMergeSuggestions _contactMergeSuggestions;
    /** Reflects the Office Delve organization level setting. When set to true, the organization doesn't have access to Office Delve. This setting is read-only and can only be changed by administrators in the SharePoint admin center. */
    private Boolean _contributionToContentDiscoveryAsOrganizationDisabled;
    /** When set to true, documents in the user's Office Delve are disabled. Users can control this setting in Office Delve. */
    private Boolean _contributionToContentDiscoveryDisabled;
    /** The user's settings for the visibility of meeting hour insights, and insights derived between a user and other items in Microsoft 365, such as documents or sites. Get userInsightsSettings through this navigation property. */
    private UserInsightsSettings _itemInsights;
    /** The user's preferences for languages, regional locale and date/time formatting. */
    private RegionalAndLanguageSettings _regionalAndLanguageSettings;
    /** The shift preferences for the user. */
    private ShiftPreferences _shiftPreferences;
    /**
     * Instantiates a new userSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserSettings() {
        super();
        this.setOdataType("#microsoft.graph.userSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSettings
     */
    @javax.annotation.Nonnull
    public static UserSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSettings();
    }
    /**
     * Gets the contactMergeSuggestions property value. The user's settings for the visibility of merge suggestion for the duplicate contacts in the user's contact list.
     * @return a contactMergeSuggestions
     */
    @javax.annotation.Nullable
    public ContactMergeSuggestions getContactMergeSuggestions() {
        return this._contactMergeSuggestions;
    }
    /**
     * Gets the contributionToContentDiscoveryAsOrganizationDisabled property value. Reflects the Office Delve organization level setting. When set to true, the organization doesn't have access to Office Delve. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContributionToContentDiscoveryAsOrganizationDisabled() {
        return this._contributionToContentDiscoveryAsOrganizationDisabled;
    }
    /**
     * Gets the contributionToContentDiscoveryDisabled property value. When set to true, documents in the user's Office Delve are disabled. Users can control this setting in Office Delve.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContributionToContentDiscoveryDisabled() {
        return this._contributionToContentDiscoveryDisabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("contactMergeSuggestions", (n) -> { currentObject.setContactMergeSuggestions(n.getObjectValue(ContactMergeSuggestions::createFromDiscriminatorValue)); });
            this.put("contributionToContentDiscoveryAsOrganizationDisabled", (n) -> { currentObject.setContributionToContentDiscoveryAsOrganizationDisabled(n.getBooleanValue()); });
            this.put("contributionToContentDiscoveryDisabled", (n) -> { currentObject.setContributionToContentDiscoveryDisabled(n.getBooleanValue()); });
            this.put("itemInsights", (n) -> { currentObject.setItemInsights(n.getObjectValue(UserInsightsSettings::createFromDiscriminatorValue)); });
            this.put("regionalAndLanguageSettings", (n) -> { currentObject.setRegionalAndLanguageSettings(n.getObjectValue(RegionalAndLanguageSettings::createFromDiscriminatorValue)); });
            this.put("shiftPreferences", (n) -> { currentObject.setShiftPreferences(n.getObjectValue(ShiftPreferences::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the itemInsights property value. The user's settings for the visibility of meeting hour insights, and insights derived between a user and other items in Microsoft 365, such as documents or sites. Get userInsightsSettings through this navigation property.
     * @return a userInsightsSettings
     */
    @javax.annotation.Nullable
    public UserInsightsSettings getItemInsights() {
        return this._itemInsights;
    }
    /**
     * Gets the regionalAndLanguageSettings property value. The user's preferences for languages, regional locale and date/time formatting.
     * @return a regionalAndLanguageSettings
     */
    @javax.annotation.Nullable
    public RegionalAndLanguageSettings getRegionalAndLanguageSettings() {
        return this._regionalAndLanguageSettings;
    }
    /**
     * Gets the shiftPreferences property value. The shift preferences for the user.
     * @return a shiftPreferences
     */
    @javax.annotation.Nullable
    public ShiftPreferences getShiftPreferences() {
        return this._shiftPreferences;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactMergeSuggestions(@javax.annotation.Nullable final ContactMergeSuggestions value) {
        this._contactMergeSuggestions = value;
    }
    /**
     * Sets the contributionToContentDiscoveryAsOrganizationDisabled property value. Reflects the Office Delve organization level setting. When set to true, the organization doesn't have access to Office Delve. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     * @param value Value to set for the contributionToContentDiscoveryAsOrganizationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContributionToContentDiscoveryAsOrganizationDisabled(@javax.annotation.Nullable final Boolean value) {
        this._contributionToContentDiscoveryAsOrganizationDisabled = value;
    }
    /**
     * Sets the contributionToContentDiscoveryDisabled property value. When set to true, documents in the user's Office Delve are disabled. Users can control this setting in Office Delve.
     * @param value Value to set for the contributionToContentDiscoveryDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContributionToContentDiscoveryDisabled(@javax.annotation.Nullable final Boolean value) {
        this._contributionToContentDiscoveryDisabled = value;
    }
    /**
     * Sets the itemInsights property value. The user's settings for the visibility of meeting hour insights, and insights derived between a user and other items in Microsoft 365, such as documents or sites. Get userInsightsSettings through this navigation property.
     * @param value Value to set for the itemInsights property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemInsights(@javax.annotation.Nullable final UserInsightsSettings value) {
        this._itemInsights = value;
    }
    /**
     * Sets the regionalAndLanguageSettings property value. The user's preferences for languages, regional locale and date/time formatting.
     * @param value Value to set for the regionalAndLanguageSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegionalAndLanguageSettings(@javax.annotation.Nullable final RegionalAndLanguageSettings value) {
        this._regionalAndLanguageSettings = value;
    }
    /**
     * Sets the shiftPreferences property value. The shift preferences for the user.
     * @param value Value to set for the shiftPreferences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShiftPreferences(@javax.annotation.Nullable final ShiftPreferences value) {
        this._shiftPreferences = value;
    }
}

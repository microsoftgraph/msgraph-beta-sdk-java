package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PeopleAdminSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PeopleAdminSettings} and sets the default values.
     */
    public PeopleAdminSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PeopleAdminSettings}
     */
    @jakarta.annotation.Nonnull
    public static PeopleAdminSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PeopleAdminSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("itemInsights", (n) -> { this.setItemInsights(n.getObjectValue(InsightsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("namePronunciation", (n) -> { this.setNamePronunciation(n.getObjectValue(NamePronunciationSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("profileCardProperties", (n) -> { this.setProfileCardProperties(n.getCollectionOfObjectValues(ProfileCardProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("profilePropertySettings", (n) -> { this.setProfilePropertySettings(n.getCollectionOfObjectValues(ProfilePropertySetting::createFromDiscriminatorValue)); });
        deserializerMap.put("pronouns", (n) -> { this.setPronouns(n.getObjectValue(PronounsSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemInsights property value. Administrator settings that manage the support for item insights in an organization.
     * @return a {@link InsightsSettings}
     */
    @jakarta.annotation.Nullable
    public InsightsSettings getItemInsights() {
        return this.backingStore.get("itemInsights");
    }
    /**
     * Gets the namePronunciation property value. Administrator settings that manage the support of name pronunciation in an organization.
     * @return a {@link NamePronunciationSettings}
     */
    @jakarta.annotation.Nullable
    public NamePronunciationSettings getNamePronunciation() {
        return this.backingStore.get("namePronunciation");
    }
    /**
     * Gets the profileCardProperties property value. A collection of the properties an administrator defined as visible on the Microsoft 365 profile card.
     * @return a {@link java.util.List<ProfileCardProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProfileCardProperty> getProfileCardProperties() {
        return this.backingStore.get("profileCardProperties");
    }
    /**
     * Gets the profilePropertySettings property value. A collection of profile property configuration settings defined by an administrator for an organization.
     * @return a {@link java.util.List<ProfilePropertySetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProfilePropertySetting> getProfilePropertySettings() {
        return this.backingStore.get("profilePropertySettings");
    }
    /**
     * Gets the pronouns property value. Administrator settings that manage the support of pronouns in an organization.
     * @return a {@link PronounsSettings}
     */
    @jakarta.annotation.Nullable
    public PronounsSettings getPronouns() {
        return this.backingStore.get("pronouns");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("itemInsights", this.getItemInsights());
        writer.writeObjectValue("namePronunciation", this.getNamePronunciation());
        writer.writeCollectionOfObjectValues("profileCardProperties", this.getProfileCardProperties());
        writer.writeCollectionOfObjectValues("profilePropertySettings", this.getProfilePropertySettings());
        writer.writeObjectValue("pronouns", this.getPronouns());
    }
    /**
     * Sets the itemInsights property value. Administrator settings that manage the support for item insights in an organization.
     * @param value Value to set for the itemInsights property.
     */
    public void setItemInsights(@jakarta.annotation.Nullable final InsightsSettings value) {
        this.backingStore.set("itemInsights", value);
    }
    /**
     * Sets the namePronunciation property value. Administrator settings that manage the support of name pronunciation in an organization.
     * @param value Value to set for the namePronunciation property.
     */
    public void setNamePronunciation(@jakarta.annotation.Nullable final NamePronunciationSettings value) {
        this.backingStore.set("namePronunciation", value);
    }
    /**
     * Sets the profileCardProperties property value. A collection of the properties an administrator defined as visible on the Microsoft 365 profile card.
     * @param value Value to set for the profileCardProperties property.
     */
    public void setProfileCardProperties(@jakarta.annotation.Nullable final java.util.List<ProfileCardProperty> value) {
        this.backingStore.set("profileCardProperties", value);
    }
    /**
     * Sets the profilePropertySettings property value. A collection of profile property configuration settings defined by an administrator for an organization.
     * @param value Value to set for the profilePropertySettings property.
     */
    public void setProfilePropertySettings(@jakarta.annotation.Nullable final java.util.List<ProfilePropertySetting> value) {
        this.backingStore.set("profilePropertySettings", value);
    }
    /**
     * Sets the pronouns property value. Administrator settings that manage the support of pronouns in an organization.
     * @param value Value to set for the pronouns property.
     */
    public void setPronouns(@jakarta.annotation.Nullable final PronounsSettings value) {
        this.backingStore.set("pronouns", value);
    }
}

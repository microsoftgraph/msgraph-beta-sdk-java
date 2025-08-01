package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAccountInformation extends ItemFacet implements Parsable {
    /**
     * Instantiates a new {@link UserAccountInformation} and sets the default values.
     */
    public UserAccountInformation() {
        super();
        this.setOdataType("#microsoft.graph.userAccountInformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserAccountInformation}
     */
    @jakarta.annotation.Nonnull
    public static UserAccountInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAccountInformation();
    }
    /**
     * Gets the ageGroup property value. Shows the age group of user. Allowed values null, minor, notAdult and adult are generated by the directory and can&apos;t be changed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgeGroup() {
        return this.backingStore.get("ageGroup");
    }
    /**
     * Gets the countryCode property value. Contains the two-character country code associated with the users&apos; account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.backingStore.get("countryCode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ageGroup", (n) -> { this.setAgeGroup(n.getStringValue()); });
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("preferredLanguageTag", (n) -> { this.setPreferredLanguageTag(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the preferredLanguageTag property value. Contains the language the user has associated as preferred for the account.
     * @return a {@link LocaleInfo}
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getPreferredLanguageTag() {
        return this.backingStore.get("preferredLanguageTag");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user associated with the account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("ageGroup", this.getAgeGroup());
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeObjectValue("preferredLanguageTag", this.getPreferredLanguageTag());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the ageGroup property value. Shows the age group of user. Allowed values null, minor, notAdult and adult are generated by the directory and can&apos;t be changed.
     * @param value Value to set for the ageGroup property.
     */
    public void setAgeGroup(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ageGroup", value);
    }
    /**
     * Sets the countryCode property value. Contains the two-character country code associated with the users&apos; account.
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("countryCode", value);
    }
    /**
     * Sets the preferredLanguageTag property value. Contains the language the user has associated as preferred for the account.
     * @param value Value to set for the preferredLanguageTag property.
     */
    public void setPreferredLanguageTag(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.backingStore.set("preferredLanguageTag", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user associated with the account.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}

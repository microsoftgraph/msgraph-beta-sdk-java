package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Data sharing consent information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DataSharingConsent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DataSharingConsent} and sets the default values.
     */
    public DataSharingConsent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DataSharingConsent}
     */
    @jakarta.annotation.Nonnull
    public static DataSharingConsent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataSharingConsent();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("grantDateTime", (n) -> { this.setGrantDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("granted", (n) -> { this.setGranted(n.getBooleanValue()); });
        deserializerMap.put("grantedByUpn", (n) -> { this.setGrantedByUpn(n.getStringValue()); });
        deserializerMap.put("grantedByUserId", (n) -> { this.setGrantedByUserId(n.getStringValue()); });
        deserializerMap.put("serviceDisplayName", (n) -> { this.setServiceDisplayName(n.getStringValue()); });
        deserializerMap.put("termsUrl", (n) -> { this.setTermsUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grantDateTime property value. The time consent was granted for this account
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGrantDateTime() {
        return this.backingStore.get("grantDateTime");
    }
    /**
     * Gets the granted property value. The granted state for the data sharing consent
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGranted() {
        return this.backingStore.get("granted");
    }
    /**
     * Gets the grantedByUpn property value. The Upn of the user that granted consent for this account
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGrantedByUpn() {
        return this.backingStore.get("grantedByUpn");
    }
    /**
     * Gets the grantedByUserId property value. The UserId of the user that granted consent for this account
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGrantedByUserId() {
        return this.backingStore.get("grantedByUserId");
    }
    /**
     * Gets the serviceDisplayName property value. The display name of the service work flow
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceDisplayName() {
        return this.backingStore.get("serviceDisplayName");
    }
    /**
     * Gets the termsUrl property value. The TermsUrl for the data sharing consent
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTermsUrl() {
        return this.backingStore.get("termsUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("grantDateTime", this.getGrantDateTime());
        writer.writeBooleanValue("granted", this.getGranted());
        writer.writeStringValue("grantedByUpn", this.getGrantedByUpn());
        writer.writeStringValue("grantedByUserId", this.getGrantedByUserId());
        writer.writeStringValue("serviceDisplayName", this.getServiceDisplayName());
        writer.writeStringValue("termsUrl", this.getTermsUrl());
    }
    /**
     * Sets the grantDateTime property value. The time consent was granted for this account
     * @param value Value to set for the grantDateTime property.
     */
    public void setGrantDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("grantDateTime", value);
    }
    /**
     * Sets the granted property value. The granted state for the data sharing consent
     * @param value Value to set for the granted property.
     */
    public void setGranted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("granted", value);
    }
    /**
     * Sets the grantedByUpn property value. The Upn of the user that granted consent for this account
     * @param value Value to set for the grantedByUpn property.
     */
    public void setGrantedByUpn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("grantedByUpn", value);
    }
    /**
     * Sets the grantedByUserId property value. The UserId of the user that granted consent for this account
     * @param value Value to set for the grantedByUserId property.
     */
    public void setGrantedByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("grantedByUserId", value);
    }
    /**
     * Sets the serviceDisplayName property value. The display name of the service work flow
     * @param value Value to set for the serviceDisplayName property.
     */
    public void setServiceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceDisplayName", value);
    }
    /**
     * Sets the termsUrl property value. The TermsUrl for the data sharing consent
     * @param value Value to set for the termsUrl property.
     */
    public void setTermsUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("termsUrl", value);
    }
}

package com.microsoft.graph.models;

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
     * The time consent was granted for this account
     */
    private OffsetDateTime grantDateTime;
    /**
     * The granted state for the data sharing consent
     */
    private Boolean granted;
    /**
     * The Upn of the user that granted consent for this account
     */
    private String grantedByUpn;
    /**
     * The UserId of the user that granted consent for this account
     */
    private String grantedByUserId;
    /**
     * The display name of the service work flow
     */
    private String serviceDisplayName;
    /**
     * The TermsUrl for the data sharing consent
     */
    private String termsUrl;
    /**
     * Instantiates a new dataSharingConsent and sets the default values.
     */
    public DataSharingConsent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dataSharingConsent
     */
    @jakarta.annotation.Nonnull
    public static DataSharingConsent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataSharingConsent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGrantDateTime() {
        return this.grantDateTime;
    }
    /**
     * Gets the granted property value. The granted state for the data sharing consent
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGranted() {
        return this.granted;
    }
    /**
     * Gets the grantedByUpn property value. The Upn of the user that granted consent for this account
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGrantedByUpn() {
        return this.grantedByUpn;
    }
    /**
     * Gets the grantedByUserId property value. The UserId of the user that granted consent for this account
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGrantedByUserId() {
        return this.grantedByUserId;
    }
    /**
     * Gets the serviceDisplayName property value. The display name of the service work flow
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServiceDisplayName() {
        return this.serviceDisplayName;
    }
    /**
     * Gets the termsUrl property value. The TermsUrl for the data sharing consent
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTermsUrl() {
        return this.termsUrl;
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
        this.grantDateTime = value;
    }
    /**
     * Sets the granted property value. The granted state for the data sharing consent
     * @param value Value to set for the granted property.
     */
    public void setGranted(@jakarta.annotation.Nullable final Boolean value) {
        this.granted = value;
    }
    /**
     * Sets the grantedByUpn property value. The Upn of the user that granted consent for this account
     * @param value Value to set for the grantedByUpn property.
     */
    public void setGrantedByUpn(@jakarta.annotation.Nullable final String value) {
        this.grantedByUpn = value;
    }
    /**
     * Sets the grantedByUserId property value. The UserId of the user that granted consent for this account
     * @param value Value to set for the grantedByUserId property.
     */
    public void setGrantedByUserId(@jakarta.annotation.Nullable final String value) {
        this.grantedByUserId = value;
    }
    /**
     * Sets the serviceDisplayName property value. The display name of the service work flow
     * @param value Value to set for the serviceDisplayName property.
     */
    public void setServiceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.serviceDisplayName = value;
    }
    /**
     * Sets the termsUrl property value. The TermsUrl for the data sharing consent
     * @param value Value to set for the termsUrl property.
     */
    public void setTermsUrl(@jakarta.annotation.Nullable final String value) {
        this.termsUrl = value;
    }
}

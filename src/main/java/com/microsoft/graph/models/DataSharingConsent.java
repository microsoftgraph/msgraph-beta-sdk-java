package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Data sharing consent information. */
public class DataSharingConsent extends Entity implements Parsable {
    /** The time consent was granted for this account */
    private OffsetDateTime _grantDateTime;
    /** The granted state for the data sharing consent */
    private Boolean _granted;
    /** The Upn of the user that granted consent for this account */
    private String _grantedByUpn;
    /** The UserId of the user that granted consent for this account */
    private String _grantedByUserId;
    /** The display name of the service work flow */
    private String _serviceDisplayName;
    /** The TermsUrl for the data sharing consent */
    private String _termsUrl;
    /**
     * Instantiates a new dataSharingConsent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DataSharingConsent() {
        super();
        this.setOdataType("#microsoft.graph.dataSharingConsent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dataSharingConsent
     */
    @javax.annotation.Nonnull
    public static DataSharingConsent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataSharingConsent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DataSharingConsent currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("grantDateTime", (n) -> { currentObject.setGrantDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("granted", (n) -> { currentObject.setGranted(n.getBooleanValue()); });
        deserializerMap.put("grantedByUpn", (n) -> { currentObject.setGrantedByUpn(n.getStringValue()); });
        deserializerMap.put("grantedByUserId", (n) -> { currentObject.setGrantedByUserId(n.getStringValue()); });
        deserializerMap.put("serviceDisplayName", (n) -> { currentObject.setServiceDisplayName(n.getStringValue()); });
        deserializerMap.put("termsUrl", (n) -> { currentObject.setTermsUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grantDateTime property value. The time consent was granted for this account
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getGrantDateTime() {
        return this._grantDateTime;
    }
    /**
     * Gets the granted property value. The granted state for the data sharing consent
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGranted() {
        return this._granted;
    }
    /**
     * Gets the grantedByUpn property value. The Upn of the user that granted consent for this account
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGrantedByUpn() {
        return this._grantedByUpn;
    }
    /**
     * Gets the grantedByUserId property value. The UserId of the user that granted consent for this account
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGrantedByUserId() {
        return this._grantedByUserId;
    }
    /**
     * Gets the serviceDisplayName property value. The display name of the service work flow
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceDisplayName() {
        return this._serviceDisplayName;
    }
    /**
     * Gets the termsUrl property value. The TermsUrl for the data sharing consent
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTermsUrl() {
        return this._termsUrl;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGrantDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._grantDateTime = value;
    }
    /**
     * Sets the granted property value. The granted state for the data sharing consent
     * @param value Value to set for the granted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGranted(@javax.annotation.Nullable final Boolean value) {
        this._granted = value;
    }
    /**
     * Sets the grantedByUpn property value. The Upn of the user that granted consent for this account
     * @param value Value to set for the grantedByUpn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGrantedByUpn(@javax.annotation.Nullable final String value) {
        this._grantedByUpn = value;
    }
    /**
     * Sets the grantedByUserId property value. The UserId of the user that granted consent for this account
     * @param value Value to set for the grantedByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGrantedByUserId(@javax.annotation.Nullable final String value) {
        this._grantedByUserId = value;
    }
    /**
     * Sets the serviceDisplayName property value. The display name of the service work flow
     * @param value Value to set for the serviceDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceDisplayName(@javax.annotation.Nullable final String value) {
        this._serviceDisplayName = value;
    }
    /**
     * Sets the termsUrl property value. The TermsUrl for the data sharing consent
     * @param value Value to set for the termsUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermsUrl(@javax.annotation.Nullable final String value) {
        this._termsUrl = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAccount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The lastSeenDateTime property
     */
    private OffsetDateTime lastSeenDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The riskScore property
     */
    private String riskScore;
    /**
     * The service property
     */
    private String service;
    /**
     * The signinName property
     */
    private String signinName;
    /**
     * The status property
     */
    private AccountStatus status;
    /**
     * Instantiates a new userAccount and sets the default values.
     */
    public UserAccount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userAccount
     */
    @jakarta.annotation.Nonnull
    public static UserAccount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAccount();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getStringValue()); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        deserializerMap.put("signinName", (n) -> { this.setSigninName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AccountStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the riskScore property value. The riskScore property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.riskScore;
    }
    /**
     * Gets the service property value. The service property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.service;
    }
    /**
     * Gets the signinName property value. The signinName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSigninName() {
        return this.signinName;
    }
    /**
     * Gets the status property value. The status property
     * @return a accountStatus
     */
    @jakarta.annotation.Nullable
    public AccountStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeStringValue("service", this.getService());
        writer.writeStringValue("signinName", this.getSigninName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the riskScore property value. The riskScore property
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.riskScore = value;
    }
    /**
     * Sets the service property value. The service property
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.service = value;
    }
    /**
     * Sets the signinName property value. The signinName property
     * @param value Value to set for the signinName property.
     */
    public void setSigninName(@jakarta.annotation.Nullable final String value) {
        this.signinName = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AccountStatus value) {
        this.status = value;
    }
}

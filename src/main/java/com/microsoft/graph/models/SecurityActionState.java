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
public class SecurityActionState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Application ID of the calling application that submitted an update (PATCH) to the action. The appId should be extracted from the auth token and not entered manually by the calling application.
     */
    private String appId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Status of the securityAction in this update. Possible values are: NotStarted, Running, Completed, Failed.
     */
    private OperationStatus status;
    /**
     * Timestamp when the actionState was updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime updatedDateTime;
    /**
     * The user principal name of the signed-in user that submitted an update (PATCH) to the action. The user should be extracted from the auth token and not entered manually by the calling application.
     */
    private String user;
    /**
     * Instantiates a new securityActionState and sets the default values.
     */
    public SecurityActionState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityActionState
     */
    @jakarta.annotation.Nonnull
    public static SecurityActionState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityActionState();
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
     * Gets the appId property value. The Application ID of the calling application that submitted an update (PATCH) to the action. The appId should be extracted from the auth token and not entered manually by the calling application.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(OperationStatus.class)); });
        deserializerMap.put("updatedDateTime", (n) -> { this.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the status property value. Status of the securityAction in this update. Possible values are: NotStarted, Running, Completed, Failed.
     * @return a operationStatus
     */
    @jakarta.annotation.Nullable
    public OperationStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the updatedDateTime property value. Timestamp when the actionState was updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this.updatedDateTime;
    }
    /**
     * Gets the user property value. The user principal name of the signed-in user that submitted an update (PATCH) to the action. The user should be extracted from the auth token and not entered manually by the calling application.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
        writer.writeStringValue("user", this.getUser());
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
     * Sets the appId property value. The Application ID of the calling application that submitted an update (PATCH) to the action. The appId should be extracted from the auth token and not entered manually by the calling application.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the status property value. Status of the securityAction in this update. Possible values are: NotStarted, Running, Completed, Failed.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final OperationStatus value) {
        this.status = value;
    }
    /**
     * Sets the updatedDateTime property value. Timestamp when the actionState was updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the updatedDateTime property.
     */
    public void setUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedDateTime = value;
    }
    /**
     * Sets the user property value. The user principal name of the signed-in user that submitted an update (PATCH) to the action. The user should be extracted from the auth token and not entered manually by the calling application.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
}

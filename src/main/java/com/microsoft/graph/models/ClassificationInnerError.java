package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClassificationInnerError implements AdditionalDataHolder, Parsable {
    /** The activityId property */
    private String activityId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The clientRequestId property */
    private String clientRequestId;
    /** The code property */
    private String code;
    /** The errorDateTime property */
    private OffsetDateTime errorDateTime;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new classificationInnerError and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClassificationInnerError() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a classificationInnerError
     */
    @javax.annotation.Nonnull
    public static ClassificationInnerError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassificationInnerError();
    }
    /**
     * Gets the activityId property value. The activityId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityId() {
        return this.activityId;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the clientRequestId property value. The clientRequestId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientRequestId() {
        return this.clientRequestId;
    }
    /**
     * Gets the code property value. The code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the errorDateTime property value. The errorDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getErrorDateTime() {
        return this.errorDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("activityId", (n) -> { this.setActivityId(n.getStringValue()); });
        deserializerMap.put("clientRequestId", (n) -> { this.setClientRequestId(n.getStringValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("errorDateTime", (n) -> { this.setErrorDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activityId", this.getActivityId());
        writer.writeStringValue("clientRequestId", this.getClientRequestId());
        writer.writeStringValue("code", this.getCode());
        writer.writeOffsetDateTimeValue("errorDateTime", this.getErrorDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityId property value. The activityId property
     * @param value Value to set for the activityId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityId(@javax.annotation.Nullable final String value) {
        this.activityId = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the clientRequestId property value. The clientRequestId property
     * @param value Value to set for the clientRequestId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientRequestId(@javax.annotation.Nullable final String value) {
        this.clientRequestId = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCode(@javax.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the errorDateTime property value. The errorDateTime property
     * @param value Value to set for the errorDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.errorDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

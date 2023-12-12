package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExactMatchSessionBase extends ExactMatchJobBase implements Parsable {
    /**
     * Instantiates a new ExactMatchSessionBase and sets the default values.
     */
    public ExactMatchSessionBase() {
        super();
        this.setOdataType("#microsoft.graph.exactMatchSessionBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExactMatchSessionBase
     */
    @jakarta.annotation.Nonnull
    public static ExactMatchSessionBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.exactMatchSession": return new ExactMatchSession();
            }
        }
        return new ExactMatchSessionBase();
    }
    /**
     * Gets the dataStoreId property value. The dataStoreId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDataStoreId() {
        return this.backingStore.get("dataStoreId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dataStoreId", (n) -> { this.setDataStoreId(n.getStringValue()); });
        deserializerMap.put("processingCompletionDateTime", (n) -> { this.setProcessingCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("remainingBlockCount", (n) -> { this.setRemainingBlockCount(n.getIntegerValue()); });
        deserializerMap.put("remainingJobCount", (n) -> { this.setRemainingJobCount(n.getIntegerValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("totalBlockCount", (n) -> { this.setTotalBlockCount(n.getIntegerValue()); });
        deserializerMap.put("totalJobCount", (n) -> { this.setTotalJobCount(n.getIntegerValue()); });
        deserializerMap.put("uploadCompletionDateTime", (n) -> { this.setUploadCompletionDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the processingCompletionDateTime property value. The processingCompletionDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProcessingCompletionDateTime() {
        return this.backingStore.get("processingCompletionDateTime");
    }
    /**
     * Gets the remainingBlockCount property value. The remainingBlockCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemainingBlockCount() {
        return this.backingStore.get("remainingBlockCount");
    }
    /**
     * Gets the remainingJobCount property value. The remainingJobCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemainingJobCount() {
        return this.backingStore.get("remainingJobCount");
    }
    /**
     * Gets the state property value. The state property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the totalBlockCount property value. The totalBlockCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalBlockCount() {
        return this.backingStore.get("totalBlockCount");
    }
    /**
     * Gets the totalJobCount property value. The totalJobCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalJobCount() {
        return this.backingStore.get("totalJobCount");
    }
    /**
     * Gets the uploadCompletionDateTime property value. The uploadCompletionDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUploadCompletionDateTime() {
        return this.backingStore.get("uploadCompletionDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("dataStoreId", this.getDataStoreId());
        writer.writeOffsetDateTimeValue("processingCompletionDateTime", this.getProcessingCompletionDateTime());
        writer.writeIntegerValue("remainingBlockCount", this.getRemainingBlockCount());
        writer.writeIntegerValue("remainingJobCount", this.getRemainingJobCount());
        writer.writeStringValue("state", this.getState());
        writer.writeIntegerValue("totalBlockCount", this.getTotalBlockCount());
        writer.writeIntegerValue("totalJobCount", this.getTotalJobCount());
        writer.writeOffsetDateTimeValue("uploadCompletionDateTime", this.getUploadCompletionDateTime());
    }
    /**
     * Sets the dataStoreId property value. The dataStoreId property
     * @param value Value to set for the dataStoreId property.
     */
    public void setDataStoreId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataStoreId", value);
    }
    /**
     * Sets the processingCompletionDateTime property value. The processingCompletionDateTime property
     * @param value Value to set for the processingCompletionDateTime property.
     */
    public void setProcessingCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("processingCompletionDateTime", value);
    }
    /**
     * Sets the remainingBlockCount property value. The remainingBlockCount property
     * @param value Value to set for the remainingBlockCount property.
     */
    public void setRemainingBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("remainingBlockCount", value);
    }
    /**
     * Sets the remainingJobCount property value. The remainingJobCount property
     * @param value Value to set for the remainingJobCount property.
     */
    public void setRemainingJobCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("remainingJobCount", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the totalBlockCount property value. The totalBlockCount property
     * @param value Value to set for the totalBlockCount property.
     */
    public void setTotalBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalBlockCount", value);
    }
    /**
     * Sets the totalJobCount property value. The totalJobCount property
     * @param value Value to set for the totalJobCount property.
     */
    public void setTotalJobCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalJobCount", value);
    }
    /**
     * Sets the uploadCompletionDateTime property value. The uploadCompletionDateTime property
     * @param value Value to set for the uploadCompletionDateTime property.
     */
    public void setUploadCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("uploadCompletionDateTime", value);
    }
}

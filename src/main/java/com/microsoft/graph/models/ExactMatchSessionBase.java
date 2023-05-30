package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExactMatchSessionBase extends ExactMatchJobBase implements Parsable {
    /** The dataStoreId property */
    private String dataStoreId;
    /** The processingCompletionDateTime property */
    private OffsetDateTime processingCompletionDateTime;
    /** The remainingBlockCount property */
    private Integer remainingBlockCount;
    /** The remainingJobCount property */
    private Integer remainingJobCount;
    /** The state property */
    private String state;
    /** The totalBlockCount property */
    private Integer totalBlockCount;
    /** The totalJobCount property */
    private Integer totalJobCount;
    /** The uploadCompletionDateTime property */
    private OffsetDateTime uploadCompletionDateTime;
    /**
     * Instantiates a new ExactMatchSessionBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExactMatchSessionBase() {
        super();
        this.setOdataType("#microsoft.graph.exactMatchSessionBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExactMatchSessionBase
     */
    @javax.annotation.Nonnull
    public static ExactMatchSessionBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDataStoreId() {
        return this.dataStoreId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public OffsetDateTime getProcessingCompletionDateTime() {
        return this.processingCompletionDateTime;
    }
    /**
     * Gets the remainingBlockCount property value. The remainingBlockCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemainingBlockCount() {
        return this.remainingBlockCount;
    }
    /**
     * Gets the remainingJobCount property value. The remainingJobCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemainingJobCount() {
        return this.remainingJobCount;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the totalBlockCount property value. The totalBlockCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalBlockCount() {
        return this.totalBlockCount;
    }
    /**
     * Gets the totalJobCount property value. The totalJobCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalJobCount() {
        return this.totalJobCount;
    }
    /**
     * Gets the uploadCompletionDateTime property value. The uploadCompletionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUploadCompletionDateTime() {
        return this.uploadCompletionDateTime;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataStoreId(@javax.annotation.Nullable final String value) {
        this.dataStoreId = value;
    }
    /**
     * Sets the processingCompletionDateTime property value. The processingCompletionDateTime property
     * @param value Value to set for the processingCompletionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessingCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.processingCompletionDateTime = value;
    }
    /**
     * Sets the remainingBlockCount property value. The remainingBlockCount property
     * @param value Value to set for the remainingBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemainingBlockCount(@javax.annotation.Nullable final Integer value) {
        this.remainingBlockCount = value;
    }
    /**
     * Sets the remainingJobCount property value. The remainingJobCount property
     * @param value Value to set for the remainingJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemainingJobCount(@javax.annotation.Nullable final Integer value) {
        this.remainingJobCount = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the totalBlockCount property value. The totalBlockCount property
     * @param value Value to set for the totalBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalBlockCount(@javax.annotation.Nullable final Integer value) {
        this.totalBlockCount = value;
    }
    /**
     * Sets the totalJobCount property value. The totalJobCount property
     * @param value Value to set for the totalJobCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalJobCount(@javax.annotation.Nullable final Integer value) {
        this.totalJobCount = value;
    }
    /**
     * Sets the uploadCompletionDateTime property value. The uploadCompletionDateTime property
     * @param value Value to set for the uploadCompletionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUploadCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.uploadCompletionDateTime = value;
    }
}

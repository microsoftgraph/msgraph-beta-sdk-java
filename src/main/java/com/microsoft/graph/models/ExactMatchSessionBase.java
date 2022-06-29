package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExactMatchSessionBase extends ExactMatchJobBase implements Parsable {
    /** The dataStoreId property */
    private String _dataStoreId;
    /** The processingCompletionDateTime property */
    private OffsetDateTime _processingCompletionDateTime;
    /** The remainingBlockCount property */
    private Integer _remainingBlockCount;
    /** The remainingJobCount property */
    private Integer _remainingJobCount;
    /** The state property */
    private String _state;
    /** The totalBlockCount property */
    private Integer _totalBlockCount;
    /** The totalJobCount property */
    private Integer _totalJobCount;
    /** The uploadCompletionDateTime property */
    private OffsetDateTime _uploadCompletionDateTime;
    /**
     * Instantiates a new ExactMatchSessionBase and sets the default values.
     * @return a void
     */
    public ExactMatchSessionBase() {
        super();
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
        return this._dataStoreId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExactMatchSessionBase currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("dataStoreId", (n) -> { currentObject.setDataStoreId(n.getStringValue()); });
            this.put("processingCompletionDateTime", (n) -> { currentObject.setProcessingCompletionDateTime(n.getOffsetDateTimeValue()); });
            this.put("remainingBlockCount", (n) -> { currentObject.setRemainingBlockCount(n.getIntegerValue()); });
            this.put("remainingJobCount", (n) -> { currentObject.setRemainingJobCount(n.getIntegerValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
            this.put("totalBlockCount", (n) -> { currentObject.setTotalBlockCount(n.getIntegerValue()); });
            this.put("totalJobCount", (n) -> { currentObject.setTotalJobCount(n.getIntegerValue()); });
            this.put("uploadCompletionDateTime", (n) -> { currentObject.setUploadCompletionDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the processingCompletionDateTime property value. The processingCompletionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getProcessingCompletionDateTime() {
        return this._processingCompletionDateTime;
    }
    /**
     * Gets the remainingBlockCount property value. The remainingBlockCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemainingBlockCount() {
        return this._remainingBlockCount;
    }
    /**
     * Gets the remainingJobCount property value. The remainingJobCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemainingJobCount() {
        return this._remainingJobCount;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Gets the totalBlockCount property value. The totalBlockCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalBlockCount() {
        return this._totalBlockCount;
    }
    /**
     * Gets the totalJobCount property value. The totalJobCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalJobCount() {
        return this._totalJobCount;
    }
    /**
     * Gets the uploadCompletionDateTime property value. The uploadCompletionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUploadCompletionDateTime() {
        return this._uploadCompletionDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDataStoreId(@javax.annotation.Nullable final String value) {
        this._dataStoreId = value;
    }
    /**
     * Sets the processingCompletionDateTime property value. The processingCompletionDateTime property
     * @param value Value to set for the processingCompletionDateTime property.
     * @return a void
     */
    public void setProcessingCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._processingCompletionDateTime = value;
    }
    /**
     * Sets the remainingBlockCount property value. The remainingBlockCount property
     * @param value Value to set for the remainingBlockCount property.
     * @return a void
     */
    public void setRemainingBlockCount(@javax.annotation.Nullable final Integer value) {
        this._remainingBlockCount = value;
    }
    /**
     * Sets the remainingJobCount property value. The remainingJobCount property
     * @param value Value to set for the remainingJobCount property.
     * @return a void
     */
    public void setRemainingJobCount(@javax.annotation.Nullable final Integer value) {
        this._remainingJobCount = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
    /**
     * Sets the totalBlockCount property value. The totalBlockCount property
     * @param value Value to set for the totalBlockCount property.
     * @return a void
     */
    public void setTotalBlockCount(@javax.annotation.Nullable final Integer value) {
        this._totalBlockCount = value;
    }
    /**
     * Sets the totalJobCount property value. The totalJobCount property
     * @param value Value to set for the totalJobCount property.
     * @return a void
     */
    public void setTotalJobCount(@javax.annotation.Nullable final Integer value) {
        this._totalJobCount = value;
    }
    /**
     * Sets the uploadCompletionDateTime property value. The uploadCompletionDateTime property
     * @param value Value to set for the uploadCompletionDateTime property.
     * @return a void
     */
    public void setUploadCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._uploadCompletionDateTime = value;
    }
}

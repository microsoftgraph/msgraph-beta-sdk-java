package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
import microsoft.graph.models.IdentitySet;
import microsoft.graph.models.ResultInfo;
public class CaseOperation extends Entity implements Parsable {
    /** The action property  */
    private CaseAction _action;
    /** The completedDateTime property  */
    private OffsetDateTime _completedDateTime;
    /** The createdBy property  */
    private IdentitySet _createdBy;
    /** The createdDateTime property  */
    private OffsetDateTime _createdDateTime;
    /** The percentProgress property  */
    private Integer _percentProgress;
    /** The resultInfo property  */
    private ResultInfo _resultInfo;
    /** The status property  */
    private CaseOperationStatus _status;
    /**
     * Instantiates a new caseOperation and sets the default values.
     * @return a void
     */
    public CaseOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a caseOperation
     */
    @javax.annotation.Nonnull
    public static CaseOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseOperation();
    }
    /**
     * Gets the action property value. The action property
     * @return a caseAction
     */
    @javax.annotation.Nullable
    public CaseAction getAction() {
        return this._action;
    }
    /**
     * Gets the completedDateTime property value. The completedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CaseOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(CaseAction.class)); });
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("percentProgress", (n) -> { currentObject.setPercentProgress(n.getIntegerValue()); });
            this.put("resultInfo", (n) -> { currentObject.setResultInfo(n.getObjectValue(ResultInfo::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(CaseOperationStatus.class)); });
        }};
    }
    /**
     * Gets the percentProgress property value. The percentProgress property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPercentProgress() {
        return this._percentProgress;
    }
    /**
     * Gets the resultInfo property value. The resultInfo property
     * @return a resultInfo
     */
    @javax.annotation.Nullable
    public ResultInfo getResultInfo() {
        return this._resultInfo;
    }
    /**
     * Gets the status property value. The status property
     * @return a caseOperationStatus
     */
    @javax.annotation.Nullable
    public CaseOperationStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("percentProgress", this.getPercentProgress());
        writer.writeObjectValue("resultInfo", this.getResultInfo());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final CaseAction value) {
        this._action = value;
    }
    /**
     * Sets the completedDateTime property value. The completedDateTime property
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the percentProgress property value. The percentProgress property
     * @param value Value to set for the percentProgress property.
     * @return a void
     */
    public void setPercentProgress(@javax.annotation.Nullable final Integer value) {
        this._percentProgress = value;
    }
    /**
     * Sets the resultInfo property value. The resultInfo property
     * @param value Value to set for the resultInfo property.
     * @return a void
     */
    public void setResultInfo(@javax.annotation.Nullable final ResultInfo value) {
        this._resultInfo = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final CaseOperationStatus value) {
        this._status = value;
    }
}

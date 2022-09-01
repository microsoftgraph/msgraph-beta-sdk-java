package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementIntentUserStateSummary extends Entity implements Parsable {
    /** Number of users in conflict */
    private Integer _conflictCount;
    /** Number of error users */
    private Integer _errorCount;
    /** Number of failed users */
    private Integer _failedCount;
    /** Number of not applicable users */
    private Integer _notApplicableCount;
    /** Number of succeeded users */
    private Integer _successCount;
    /**
     * Instantiates a new deviceManagementIntentUserStateSummary and sets the default values.
     * @return a void
     */
    public DeviceManagementIntentUserStateSummary() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementIntentUserStateSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementIntentUserStateSummary
     */
    @javax.annotation.Nonnull
    public static DeviceManagementIntentUserStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntentUserStateSummary();
    }
    /**
     * Gets the conflictCount property value. Number of users in conflict
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictCount() {
        return this._conflictCount;
    }
    /**
     * Gets the errorCount property value. Number of error users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCount() {
        return this._errorCount;
    }
    /**
     * Gets the failedCount property value. Number of failed users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedCount() {
        return this._failedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementIntentUserStateSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("conflictCount", (n) -> { currentObject.setConflictCount(n.getIntegerValue()); });
            this.put("errorCount", (n) -> { currentObject.setErrorCount(n.getIntegerValue()); });
            this.put("failedCount", (n) -> { currentObject.setFailedCount(n.getIntegerValue()); });
            this.put("notApplicableCount", (n) -> { currentObject.setNotApplicableCount(n.getIntegerValue()); });
            this.put("successCount", (n) -> { currentObject.setSuccessCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this._notApplicableCount;
    }
    /**
     * Gets the successCount property value. Number of succeeded users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessCount() {
        return this._successCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("conflictCount", this.getConflictCount());
        writer.writeIntegerValue("errorCount", this.getErrorCount());
        writer.writeIntegerValue("failedCount", this.getFailedCount());
        writer.writeIntegerValue("notApplicableCount", this.getNotApplicableCount());
        writer.writeIntegerValue("successCount", this.getSuccessCount());
    }
    /**
     * Sets the conflictCount property value. Number of users in conflict
     * @param value Value to set for the conflictCount property.
     * @return a void
     */
    public void setConflictCount(@javax.annotation.Nullable final Integer value) {
        this._conflictCount = value;
    }
    /**
     * Sets the errorCount property value. Number of error users
     * @param value Value to set for the errorCount property.
     * @return a void
     */
    public void setErrorCount(@javax.annotation.Nullable final Integer value) {
        this._errorCount = value;
    }
    /**
     * Sets the failedCount property value. Number of failed users
     * @param value Value to set for the failedCount property.
     * @return a void
     */
    public void setFailedCount(@javax.annotation.Nullable final Integer value) {
        this._failedCount = value;
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable users
     * @param value Value to set for the notApplicableCount property.
     * @return a void
     */
    public void setNotApplicableCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableCount = value;
    }
    /**
     * Sets the successCount property value. Number of succeeded users
     * @param value Value to set for the successCount property.
     * @return a void
     */
    public void setSuccessCount(@javax.annotation.Nullable final Integer value) {
        this._successCount = value;
    }
}

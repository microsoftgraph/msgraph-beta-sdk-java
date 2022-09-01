package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceConfigurationUserStateSummary extends Entity implements Parsable {
    /** Number of compliant users */
    private Integer _compliantUserCount;
    /** Number of conflict users */
    private Integer _conflictUserCount;
    /** Number of error users */
    private Integer _errorUserCount;
    /** Number of NonCompliant users */
    private Integer _nonCompliantUserCount;
    /** Number of not applicable users */
    private Integer _notApplicableUserCount;
    /** Number of remediated users */
    private Integer _remediatedUserCount;
    /** Number of unknown users */
    private Integer _unknownUserCount;
    /**
     * Instantiates a new deviceConfigurationUserStateSummary and sets the default values.
     * @return a void
     */
    public DeviceConfigurationUserStateSummary() {
        super();
        this.setOdataType("#microsoft.graph.deviceConfigurationUserStateSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfigurationUserStateSummary
     */
    @javax.annotation.Nonnull
    public static DeviceConfigurationUserStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationUserStateSummary();
    }
    /**
     * Gets the compliantUserCount property value. Number of compliant users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliantUserCount() {
        return this._compliantUserCount;
    }
    /**
     * Gets the conflictUserCount property value. Number of conflict users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictUserCount() {
        return this._conflictUserCount;
    }
    /**
     * Gets the errorUserCount property value. Number of error users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorUserCount() {
        return this._errorUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceConfigurationUserStateSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("compliantUserCount", (n) -> { currentObject.setCompliantUserCount(n.getIntegerValue()); });
            this.put("conflictUserCount", (n) -> { currentObject.setConflictUserCount(n.getIntegerValue()); });
            this.put("errorUserCount", (n) -> { currentObject.setErrorUserCount(n.getIntegerValue()); });
            this.put("nonCompliantUserCount", (n) -> { currentObject.setNonCompliantUserCount(n.getIntegerValue()); });
            this.put("notApplicableUserCount", (n) -> { currentObject.setNotApplicableUserCount(n.getIntegerValue()); });
            this.put("remediatedUserCount", (n) -> { currentObject.setRemediatedUserCount(n.getIntegerValue()); });
            this.put("unknownUserCount", (n) -> { currentObject.setUnknownUserCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the nonCompliantUserCount property value. Number of NonCompliant users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNonCompliantUserCount() {
        return this._nonCompliantUserCount;
    }
    /**
     * Gets the notApplicableUserCount property value. Number of not applicable users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableUserCount() {
        return this._notApplicableUserCount;
    }
    /**
     * Gets the remediatedUserCount property value. Number of remediated users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedUserCount() {
        return this._remediatedUserCount;
    }
    /**
     * Gets the unknownUserCount property value. Number of unknown users
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownUserCount() {
        return this._unknownUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("compliantUserCount", this.getCompliantUserCount());
        writer.writeIntegerValue("conflictUserCount", this.getConflictUserCount());
        writer.writeIntegerValue("errorUserCount", this.getErrorUserCount());
        writer.writeIntegerValue("nonCompliantUserCount", this.getNonCompliantUserCount());
        writer.writeIntegerValue("notApplicableUserCount", this.getNotApplicableUserCount());
        writer.writeIntegerValue("remediatedUserCount", this.getRemediatedUserCount());
        writer.writeIntegerValue("unknownUserCount", this.getUnknownUserCount());
    }
    /**
     * Sets the compliantUserCount property value. Number of compliant users
     * @param value Value to set for the compliantUserCount property.
     * @return a void
     */
    public void setCompliantUserCount(@javax.annotation.Nullable final Integer value) {
        this._compliantUserCount = value;
    }
    /**
     * Sets the conflictUserCount property value. Number of conflict users
     * @param value Value to set for the conflictUserCount property.
     * @return a void
     */
    public void setConflictUserCount(@javax.annotation.Nullable final Integer value) {
        this._conflictUserCount = value;
    }
    /**
     * Sets the errorUserCount property value. Number of error users
     * @param value Value to set for the errorUserCount property.
     * @return a void
     */
    public void setErrorUserCount(@javax.annotation.Nullable final Integer value) {
        this._errorUserCount = value;
    }
    /**
     * Sets the nonCompliantUserCount property value. Number of NonCompliant users
     * @param value Value to set for the nonCompliantUserCount property.
     * @return a void
     */
    public void setNonCompliantUserCount(@javax.annotation.Nullable final Integer value) {
        this._nonCompliantUserCount = value;
    }
    /**
     * Sets the notApplicableUserCount property value. Number of not applicable users
     * @param value Value to set for the notApplicableUserCount property.
     * @return a void
     */
    public void setNotApplicableUserCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableUserCount = value;
    }
    /**
     * Sets the remediatedUserCount property value. Number of remediated users
     * @param value Value to set for the remediatedUserCount property.
     * @return a void
     */
    public void setRemediatedUserCount(@javax.annotation.Nullable final Integer value) {
        this._remediatedUserCount = value;
    }
    /**
     * Sets the unknownUserCount property value. Number of unknown users
     * @param value Value to set for the unknownUserCount property.
     * @return a void
     */
    public void setUnknownUserCount(@javax.annotation.Nullable final Integer value) {
        this._unknownUserCount = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.graph.models.SecurityBaselineCategoryStateSummary;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The security baseline compliance state summary for the security baseline of the account. */
public class SecurityBaselineStateSummary extends Entity implements Parsable {
    /** Number of conflict devices */
    private Integer _conflictCount;
    /** Number of error devices */
    private Integer _errorCount;
    /** Number of not applicable devices */
    private Integer _notApplicableCount;
    /** Number of not secure devices */
    private Integer _notSecureCount;
    /** Number of secure devices */
    private Integer _secureCount;
    /** Number of unknown devices */
    private Integer _unknownCount;
    /**
     * Instantiates a new securityBaselineStateSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecurityBaselineStateSummary() {
        super();
        this.setOdataType("#microsoft.graph.securityBaselineStateSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityBaselineStateSummary
     */
    @javax.annotation.Nonnull
    public static SecurityBaselineStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.securityBaselineCategoryStateSummary": return new SecurityBaselineCategoryStateSummary();
            }
        }
        return new SecurityBaselineStateSummary();
    }
    /**
     * Gets the conflictCount property value. Number of conflict devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictCount() {
        return this._conflictCount;
    }
    /**
     * Gets the errorCount property value. Number of error devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCount() {
        return this._errorCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecurityBaselineStateSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("conflictCount", (n) -> { currentObject.setConflictCount(n.getIntegerValue()); });
            this.put("errorCount", (n) -> { currentObject.setErrorCount(n.getIntegerValue()); });
            this.put("notApplicableCount", (n) -> { currentObject.setNotApplicableCount(n.getIntegerValue()); });
            this.put("notSecureCount", (n) -> { currentObject.setNotSecureCount(n.getIntegerValue()); });
            this.put("secureCount", (n) -> { currentObject.setSecureCount(n.getIntegerValue()); });
            this.put("unknownCount", (n) -> { currentObject.setUnknownCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this._notApplicableCount;
    }
    /**
     * Gets the notSecureCount property value. Number of not secure devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotSecureCount() {
        return this._notSecureCount;
    }
    /**
     * Gets the secureCount property value. Number of secure devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSecureCount() {
        return this._secureCount;
    }
    /**
     * Gets the unknownCount property value. Number of unknown devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownCount() {
        return this._unknownCount;
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
        writer.writeIntegerValue("conflictCount", this.getConflictCount());
        writer.writeIntegerValue("errorCount", this.getErrorCount());
        writer.writeIntegerValue("notApplicableCount", this.getNotApplicableCount());
        writer.writeIntegerValue("notSecureCount", this.getNotSecureCount());
        writer.writeIntegerValue("secureCount", this.getSecureCount());
        writer.writeIntegerValue("unknownCount", this.getUnknownCount());
    }
    /**
     * Sets the conflictCount property value. Number of conflict devices
     * @param value Value to set for the conflictCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConflictCount(@javax.annotation.Nullable final Integer value) {
        this._conflictCount = value;
    }
    /**
     * Sets the errorCount property value. Number of error devices
     * @param value Value to set for the errorCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCount(@javax.annotation.Nullable final Integer value) {
        this._errorCount = value;
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotApplicableCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableCount = value;
    }
    /**
     * Sets the notSecureCount property value. Number of not secure devices
     * @param value Value to set for the notSecureCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotSecureCount(@javax.annotation.Nullable final Integer value) {
        this._notSecureCount = value;
    }
    /**
     * Sets the secureCount property value. Number of secure devices
     * @param value Value to set for the secureCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureCount(@javax.annotation.Nullable final Integer value) {
        this._secureCount = value;
    }
    /**
     * Sets the unknownCount property value. Number of unknown devices
     * @param value Value to set for the unknownCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnknownCount(@javax.annotation.Nullable final Integer value) {
        this._unknownCount = value;
    }
}

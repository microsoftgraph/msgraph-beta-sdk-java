package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The security baseline compliance state summary for the security baseline of the account.
 */
public class SecurityBaselineStateSummary extends Entity implements Parsable {
    /**
     * Number of conflict devices
     */
    private Integer conflictCount;
    /**
     * Number of error devices
     */
    private Integer errorCount;
    /**
     * Number of not applicable devices
     */
    private Integer notApplicableCount;
    /**
     * Number of not secure devices
     */
    private Integer notSecureCount;
    /**
     * Number of secure devices
     */
    private Integer secureCount;
    /**
     * Number of unknown devices
     */
    private Integer unknownCount;
    /**
     * Instantiates a new securityBaselineStateSummary and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SecurityBaselineStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityBaselineStateSummary
     */
    @jakarta.annotation.Nonnull
    public static SecurityBaselineStateSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
    @jakarta.annotation.Nullable
    public Integer getConflictCount() {
        return this.conflictCount;
    }
    /**
     * Gets the errorCount property value. Number of error devices
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCount() {
        return this.errorCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conflictCount", (n) -> { this.setConflictCount(n.getIntegerValue()); });
        deserializerMap.put("errorCount", (n) -> { this.setErrorCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableCount", (n) -> { this.setNotApplicableCount(n.getIntegerValue()); });
        deserializerMap.put("notSecureCount", (n) -> { this.setNotSecureCount(n.getIntegerValue()); });
        deserializerMap.put("secureCount", (n) -> { this.setSecureCount(n.getIntegerValue()); });
        deserializerMap.put("unknownCount", (n) -> { this.setUnknownCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable devices
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this.notApplicableCount;
    }
    /**
     * Gets the notSecureCount property value. Number of not secure devices
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotSecureCount() {
        return this.notSecureCount;
    }
    /**
     * Gets the secureCount property value. Number of secure devices
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSecureCount() {
        return this.secureCount;
    }
    /**
     * Gets the unknownCount property value. Number of unknown devices
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownCount() {
        return this.unknownCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setConflictCount(@jakarta.annotation.Nullable final Integer value) {
        this.conflictCount = value;
    }
    /**
     * Sets the errorCount property value. Number of error devices
     * @param value Value to set for the errorCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setErrorCount(@jakarta.annotation.Nullable final Integer value) {
        this.errorCount = value;
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNotApplicableCount(@jakarta.annotation.Nullable final Integer value) {
        this.notApplicableCount = value;
    }
    /**
     * Sets the notSecureCount property value. Number of not secure devices
     * @param value Value to set for the notSecureCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNotSecureCount(@jakarta.annotation.Nullable final Integer value) {
        this.notSecureCount = value;
    }
    /**
     * Sets the secureCount property value. Number of secure devices
     * @param value Value to set for the secureCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSecureCount(@jakarta.annotation.Nullable final Integer value) {
        this.secureCount = value;
    }
    /**
     * Sets the unknownCount property value. Number of unknown devices
     * @param value Value to set for the unknownCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUnknownCount(@jakarta.annotation.Nullable final Integer value) {
        this.unknownCount = value;
    }
}

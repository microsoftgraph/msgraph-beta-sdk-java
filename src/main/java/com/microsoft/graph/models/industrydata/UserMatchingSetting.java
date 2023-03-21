package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserMatchingSetting implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The RefUserMatchTarget for matching a user from the source with an Azure Active Directory user object. */
    private UserMatchTargetReferenceValue matchTarget;
    /** The OdataType property */
    private String odataType;
    /** The priority order to apply when a user has multiple RefRole codes assigned. */
    private Integer priorityOrder;
    /** The roleGroup property */
    private RoleGroup roleGroup;
    /** The sourceIdentifier property */
    private IdentifierTypeReferenceValue sourceIdentifier;
    /**
     * Instantiates a new userMatchingSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserMatchingSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userMatchingSetting
     */
    @javax.annotation.Nonnull
    public static UserMatchingSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserMatchingSetting();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("matchTarget", (n) -> { this.setMatchTarget(n.getObjectValue(UserMatchTargetReferenceValue::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("priorityOrder", (n) -> { this.setPriorityOrder(n.getIntegerValue()); });
        deserializerMap.put("roleGroup", (n) -> { this.setRoleGroup(n.getObjectValue(RoleGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceIdentifier", (n) -> { this.setSourceIdentifier(n.getObjectValue(IdentifierTypeReferenceValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the matchTarget property value. The RefUserMatchTarget for matching a user from the source with an Azure Active Directory user object.
     * @return a userMatchTargetReferenceValue
     */
    @javax.annotation.Nullable
    public UserMatchTargetReferenceValue getMatchTarget() {
        return this.matchTarget;
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
     * Gets the priorityOrder property value. The priority order to apply when a user has multiple RefRole codes assigned.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriorityOrder() {
        return this.priorityOrder;
    }
    /**
     * Gets the roleGroup property value. The roleGroup property
     * @return a roleGroup
     */
    @javax.annotation.Nullable
    public RoleGroup getRoleGroup() {
        return this.roleGroup;
    }
    /**
     * Gets the sourceIdentifier property value. The sourceIdentifier property
     * @return a identifierTypeReferenceValue
     */
    @javax.annotation.Nullable
    public IdentifierTypeReferenceValue getSourceIdentifier() {
        return this.sourceIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("matchTarget", this.getMatchTarget());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("priorityOrder", this.getPriorityOrder());
        writer.writeObjectValue("roleGroup", this.getRoleGroup());
        writer.writeObjectValue("sourceIdentifier", this.getSourceIdentifier());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the matchTarget property value. The RefUserMatchTarget for matching a user from the source with an Azure Active Directory user object.
     * @param value Value to set for the matchTarget property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchTarget(@javax.annotation.Nullable final UserMatchTargetReferenceValue value) {
        this.matchTarget = value;
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
    /**
     * Sets the priorityOrder property value. The priority order to apply when a user has multiple RefRole codes assigned.
     * @param value Value to set for the priorityOrder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriorityOrder(@javax.annotation.Nullable final Integer value) {
        this.priorityOrder = value;
    }
    /**
     * Sets the roleGroup property value. The roleGroup property
     * @param value Value to set for the roleGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleGroup(@javax.annotation.Nullable final RoleGroup value) {
        this.roleGroup = value;
    }
    /**
     * Sets the sourceIdentifier property value. The sourceIdentifier property
     * @param value Value to set for the sourceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceIdentifier(@javax.annotation.Nullable final IdentifierTypeReferenceValue value) {
        this.sourceIdentifier = value;
    }
}

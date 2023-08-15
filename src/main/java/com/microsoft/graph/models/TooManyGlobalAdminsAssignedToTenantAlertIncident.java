package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TooManyGlobalAdminsAssignedToTenantAlertIncident extends UnifiedRoleManagementAlertIncident implements Parsable {
    /**
     * Display name of the subject that the incident applies to.
     */
    private String assigneeDisplayName;
    /**
     * The identifier of the subject that the incident applies to.
     */
    private String assigneeId;
    /**
     * User principal name of the subject that the incident applies to. Applies to user principals.
     */
    private String assigneeUserPrincipalName;
    /**
     * Instantiates a new tooManyGlobalAdminsAssignedToTenantAlertIncident and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TooManyGlobalAdminsAssignedToTenantAlertIncident() {
        super();
        this.setOdataType("#microsoft.graph.tooManyGlobalAdminsAssignedToTenantAlertIncident");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tooManyGlobalAdminsAssignedToTenantAlertIncident
     */
    @jakarta.annotation.Nonnull
    public static TooManyGlobalAdminsAssignedToTenantAlertIncident createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TooManyGlobalAdminsAssignedToTenantAlertIncident();
    }
    /**
     * Gets the assigneeDisplayName property value. Display name of the subject that the incident applies to.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssigneeDisplayName() {
        return this.assigneeDisplayName;
    }
    /**
     * Gets the assigneeId property value. The identifier of the subject that the incident applies to.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssigneeId() {
        return this.assigneeId;
    }
    /**
     * Gets the assigneeUserPrincipalName property value. User principal name of the subject that the incident applies to. Applies to user principals.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssigneeUserPrincipalName() {
        return this.assigneeUserPrincipalName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assigneeDisplayName", (n) -> { this.setAssigneeDisplayName(n.getStringValue()); });
        deserializerMap.put("assigneeId", (n) -> { this.setAssigneeId(n.getStringValue()); });
        deserializerMap.put("assigneeUserPrincipalName", (n) -> { this.setAssigneeUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("assigneeDisplayName", this.getAssigneeDisplayName());
        writer.writeStringValue("assigneeId", this.getAssigneeId());
        writer.writeStringValue("assigneeUserPrincipalName", this.getAssigneeUserPrincipalName());
    }
    /**
     * Sets the assigneeDisplayName property value. Display name of the subject that the incident applies to.
     * @param value Value to set for the assigneeDisplayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssigneeDisplayName(@jakarta.annotation.Nullable final String value) {
        this.assigneeDisplayName = value;
    }
    /**
     * Sets the assigneeId property value. The identifier of the subject that the incident applies to.
     * @param value Value to set for the assigneeId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssigneeId(@jakarta.annotation.Nullable final String value) {
        this.assigneeId = value;
    }
    /**
     * Sets the assigneeUserPrincipalName property value. User principal name of the subject that the incident applies to. Applies to user principals.
     * @param value Value to set for the assigneeUserPrincipalName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssigneeUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.assigneeUserPrincipalName = value;
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementAlertIncident extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRoleManagementAlertIncident} and sets the default values.
     */
    public UnifiedRoleManagementAlertIncident() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRoleManagementAlertIncident}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementAlertIncident createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.invalidLicenseAlertIncident": return new InvalidLicenseAlertIncident();
                case "#microsoft.graph.noMfaOnRoleActivationAlertIncident": return new NoMfaOnRoleActivationAlertIncident();
                case "#microsoft.graph.redundantAssignmentAlertIncident": return new RedundantAssignmentAlertIncident();
                case "#microsoft.graph.rolesAssignedOutsidePrivilegedIdentityManagementAlertIncident": return new RolesAssignedOutsidePrivilegedIdentityManagementAlertIncident();
                case "#microsoft.graph.sequentialActivationRenewalsAlertIncident": return new SequentialActivationRenewalsAlertIncident();
                case "#microsoft.graph.staleSignInAlertIncident": return new StaleSignInAlertIncident();
                case "#microsoft.graph.tooManyGlobalAdminsAssignedToTenantAlertIncident": return new TooManyGlobalAdminsAssignedToTenantAlertIncident();
            }
        }
        return new UnifiedRoleManagementAlertIncident();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}

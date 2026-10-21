package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppManagementAudit extends DirectoryAudit implements Parsable {
    /**
     * Instantiates a new {@link AppManagementAudit} and sets the default values.
     */
    public AppManagementAudit() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppManagementAudit}
     */
    @jakarta.annotation.Nonnull
    public static AppManagementAudit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppManagementAudit();
    }
    /**
     * Gets the appliedAppManagementPolicyRestrictions property value. The appliedAppManagementPolicyRestrictions property
     * @return a {@link java.util.List<AppliedAppManagementPolicyRestriction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppliedAppManagementPolicyRestriction> getAppliedAppManagementPolicyRestrictions() {
        return this.backingStore.get("appliedAppManagementPolicyRestrictions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appliedAppManagementPolicyRestrictions", (n) -> { this.setAppliedAppManagementPolicyRestrictions(n.getCollectionOfObjectValues(AppliedAppManagementPolicyRestriction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appliedAppManagementPolicyRestrictions", this.getAppliedAppManagementPolicyRestrictions());
    }
    /**
     * Sets the appliedAppManagementPolicyRestrictions property value. The appliedAppManagementPolicyRestrictions property
     * @param value Value to set for the appliedAppManagementPolicyRestrictions property.
     */
    public void setAppliedAppManagementPolicyRestrictions(@jakarta.annotation.Nullable final java.util.List<AppliedAppManagementPolicyRestriction> value) {
        this.backingStore.set("appliedAppManagementPolicyRestrictions", value);
    }
}

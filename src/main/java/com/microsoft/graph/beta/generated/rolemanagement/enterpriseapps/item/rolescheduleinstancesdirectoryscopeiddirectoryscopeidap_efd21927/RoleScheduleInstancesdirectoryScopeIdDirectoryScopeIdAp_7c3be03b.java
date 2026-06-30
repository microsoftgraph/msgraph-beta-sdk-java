package com.microsoft.graph.beta.rolemanagement.enterpriseapps.item.rolescheduleinstancesdirectoryscopeiddirectoryscopeidap_efd21927;

import com.microsoft.graph.beta.models.BaseCollectionPaginationCountResponse;
import com.microsoft.graph.beta.models.UnifiedRoleScheduleInstanceBase;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Original name: RoleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAppScopeIdAppScopeIdPrincipalIdPrincipalIdRoleDefinitionIdRoleDefinitionIdGetResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAp_7c3be03b extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * Instantiates a new {@link RoleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAp_7c3be03b} and sets the default values.
     */
    public RoleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAp_7c3be03b() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RoleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAp_7c3be03b}
     */
    @jakarta.annotation.Nonnull
    public static RoleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAp_7c3be03b createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleScheduleInstancesdirectoryScopeIdDirectoryScopeIdAp_7c3be03b();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(UnifiedRoleScheduleInstanceBase::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a {@link java.util.List<UnifiedRoleScheduleInstanceBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleScheduleInstanceBase> getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleScheduleInstanceBase> value) {
        this.backingStore.set("value", value);
    }
}

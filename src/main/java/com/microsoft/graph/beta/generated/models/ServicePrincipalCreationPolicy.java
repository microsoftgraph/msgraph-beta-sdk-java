package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrincipalCreationPolicy extends PolicyBase implements Parsable {
    /**
     * Instantiates a new ServicePrincipalCreationPolicy and sets the default values.
     */
    public ServicePrincipalCreationPolicy() {
        super();
        this.setOdataType("#microsoft.graph.servicePrincipalCreationPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrincipalCreationPolicy
     */
    @jakarta.annotation.Nonnull
    public static ServicePrincipalCreationPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalCreationPolicy();
    }
    /**
     * Gets the excludes property value. The excludes property
     * @return a java.util.List<ServicePrincipalCreationConditionSet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePrincipalCreationConditionSet> getExcludes() {
        return this.backingStore.get("excludes");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("excludes", (n) -> { this.setExcludes(n.getCollectionOfObjectValues(ServicePrincipalCreationConditionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("includes", (n) -> { this.setIncludes(n.getCollectionOfObjectValues(ServicePrincipalCreationConditionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includes property value. The includes property
     * @return a java.util.List<ServicePrincipalCreationConditionSet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePrincipalCreationConditionSet> getIncludes() {
        return this.backingStore.get("includes");
    }
    /**
     * Gets the isBuiltIn property value. The isBuiltIn property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.backingStore.get("isBuiltIn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("excludes", this.getExcludes());
        writer.writeCollectionOfObjectValues("includes", this.getIncludes());
        writer.writeBooleanValue("isBuiltIn", this.getIsBuiltIn());
    }
    /**
     * Sets the excludes property value. The excludes property
     * @param value Value to set for the excludes property.
     */
    public void setExcludes(@jakarta.annotation.Nullable final java.util.List<ServicePrincipalCreationConditionSet> value) {
        this.backingStore.set("excludes", value);
    }
    /**
     * Sets the includes property value. The includes property
     * @param value Value to set for the includes property.
     */
    public void setIncludes(@jakarta.annotation.Nullable final java.util.List<ServicePrincipalCreationConditionSet> value) {
        this.backingStore.set("includes", value);
    }
    /**
     * Sets the isBuiltIn property value. The isBuiltIn property
     * @param value Value to set for the isBuiltIn property.
     */
    public void setIsBuiltIn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBuiltIn", value);
    }
}

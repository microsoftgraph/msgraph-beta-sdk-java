package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuditActivityType extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AuditActivityType} and sets the default values.
     */
    public AuditActivityType() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuditActivityType}
     */
    @jakarta.annotation.Nonnull
    public static AuditActivityType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditActivityType();
    }
    /**
     * Gets the activity property value. Indicates the activity name or the operation name (for example &apos;Create User&apos;, &apos;Add member to group&apos;). For a list of activities logged, refer to Microsoft Entra audit log categories and activities. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivity() {
        return this.backingStore.get("activity");
    }
    /**
     * Gets the category property value. Indicates which resource category that&apos;s targeted by the activity. For example: UserManagement, GroupManagement, ApplicationManagement, RoleManagement. For a list of categories for activities logged, refer to Microsoft Entra audit log categories and activities. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the service property value. Indicates information on which service initiated the activity. For example: Self-service Password Management, Core Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.backingStore.get("service");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("activity", this.getActivity());
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("service", this.getService());
    }
    /**
     * Sets the activity property value. Indicates the activity name or the operation name (for example &apos;Create User&apos;, &apos;Add member to group&apos;). For a list of activities logged, refer to Microsoft Entra audit log categories and activities. Supports $filter (eq).
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activity", value);
    }
    /**
     * Sets the category property value. Indicates which resource category that&apos;s targeted by the activity. For example: UserManagement, GroupManagement, ApplicationManagement, RoleManagement. For a list of categories for activities logged, refer to Microsoft Entra audit log categories and activities. Supports $filter (eq).
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the service property value. Indicates information on which service initiated the activity. For example: Self-service Password Management, Core Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management. Supports $filter (eq).
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("service", value);
    }
}

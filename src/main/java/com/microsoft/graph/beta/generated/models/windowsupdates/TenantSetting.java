package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Tenant-level settings singleton for Windows Autopatch updates. Each tenant has at most one resource; a missing resource means all defaults apply.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TenantSetting} and sets the default values.
     */
    public TenantSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenantSetting}
     */
    @jakarta.annotation.Nonnull
    public static TenantSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantSetting();
    }
    /**
     * Gets the areDataProcessorServiceForWindowsFeaturesEnabled property value. Whether Data Processor Service for Windows (DPSW) features are enabled for this tenant. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAreDataProcessorServiceForWindowsFeaturesEnabled() {
        return this.backingStore.get("areDataProcessorServiceForWindowsFeaturesEnabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("areDataProcessorServiceForWindowsFeaturesEnabled", (n) -> { this.setAreDataProcessorServiceForWindowsFeaturesEnabled(n.getBooleanValue()); });
        deserializerMap.put("mdmAppSettings", (n) -> { this.setMdmAppSettings(n.getCollectionOfObjectValues(MdmAppSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mdmAppSettings property value. The per-MDM-application settings for the current tenant.
     * @return a {@link java.util.List<MdmAppSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MdmAppSetting> getMdmAppSettings() {
        return this.backingStore.get("mdmAppSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("areDataProcessorServiceForWindowsFeaturesEnabled", this.getAreDataProcessorServiceForWindowsFeaturesEnabled());
        writer.writeCollectionOfObjectValues("mdmAppSettings", this.getMdmAppSettings());
    }
    /**
     * Sets the areDataProcessorServiceForWindowsFeaturesEnabled property value. Whether Data Processor Service for Windows (DPSW) features are enabled for this tenant. The default is false.
     * @param value Value to set for the areDataProcessorServiceForWindowsFeaturesEnabled property.
     */
    public void setAreDataProcessorServiceForWindowsFeaturesEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("areDataProcessorServiceForWindowsFeaturesEnabled", value);
    }
    /**
     * Sets the mdmAppSettings property value. The per-MDM-application settings for the current tenant.
     * @param value Value to set for the mdmAppSettings property.
     */
    public void setMdmAppSettings(@jakarta.annotation.Nullable final java.util.List<MdmAppSetting> value) {
        this.backingStore.set("mdmAppSettings", value);
    }
}

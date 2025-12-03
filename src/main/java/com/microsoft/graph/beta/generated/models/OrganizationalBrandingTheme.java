package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationalBrandingTheme extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OrganizationalBrandingTheme} and sets the default values.
     */
    public OrganizationalBrandingTheme() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationalBrandingTheme}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationalBrandingTheme createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalBrandingTheme();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isDefaultTheme", (n) -> { this.setIsDefaultTheme(n.getBooleanValue()); });
        deserializerMap.put("localizations", (n) -> { this.setLocalizations(n.getCollectionOfObjectValues(OrganizationalBrandingThemeLocalization::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultTheme property value. Indicates whether the theme is set as the default branding theme for the entire tenant and includes all applications within the tenant. When set to true, this theme is automatically applied to any application that does not have a specific theme assigned. This property is useful for enforcing consistent branding across multiple apps without configuring each one individually. Optional.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultTheme() {
        return this.backingStore.get("isDefaultTheme");
    }
    /**
     * Gets the localizations property value. Represents a locale-based branding theme.
     * @return a {@link java.util.List<OrganizationalBrandingThemeLocalization>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationalBrandingThemeLocalization> getLocalizations() {
        return this.backingStore.get("localizations");
    }
    /**
     * Gets the name property value. The name of the branding theme. Up to 120 characters. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isDefaultTheme", this.getIsDefaultTheme());
        writer.writeCollectionOfObjectValues("localizations", this.getLocalizations());
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the isDefaultTheme property value. Indicates whether the theme is set as the default branding theme for the entire tenant and includes all applications within the tenant. When set to true, this theme is automatically applied to any application that does not have a specific theme assigned. This property is useful for enforcing consistent branding across multiple apps without configuring each one individually. Optional.
     * @param value Value to set for the isDefaultTheme property.
     */
    public void setIsDefaultTheme(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefaultTheme", value);
    }
    /**
     * Sets the localizations property value. Represents a locale-based branding theme.
     * @param value Value to set for the localizations property.
     */
    public void setLocalizations(@jakarta.annotation.Nullable final java.util.List<OrganizationalBrandingThemeLocalization> value) {
        this.backingStore.set("localizations", value);
    }
    /**
     * Sets the name property value. The name of the branding theme. Up to 120 characters. Required.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
}

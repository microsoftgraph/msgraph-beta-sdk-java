package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Office365GroupsActivityGroupCounts extends Entity implements Parsable {
    /**
     * Instantiates a new Office365GroupsActivityGroupCounts and sets the default values.
     */
    public Office365GroupsActivityGroupCounts() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Office365GroupsActivityGroupCounts
     */
    @jakarta.annotation.Nonnull
    public static Office365GroupsActivityGroupCounts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365GroupsActivityGroupCounts();
    }
    /**
     * Gets the active property value. The number of active groups. A group is considered active if any of the following occurred: group mailbox received email, or  a user viewed, edited, shared, or synced files in SharePoint document library, or a user viewed SharePoint pages, or a user posted, read, or liked messages in Yammer groups.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getActive() {
        return this.backingStore.get("active");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("active", (n) -> { this.setActive(n.getLongValue()); });
        deserializerMap.put("reportDate", (n) -> { this.setReportDate(n.getLocalDateValue()); });
        deserializerMap.put("reportPeriod", (n) -> { this.setReportPeriod(n.getStringValue()); });
        deserializerMap.put("reportRefreshDate", (n) -> { this.setReportRefreshDate(n.getLocalDateValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reportDate property value. The date on which groups were active.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getReportDate() {
        return this.backingStore.get("reportDate");
    }
    /**
     * Gets the reportPeriod property value. The number of days the report covers.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReportPeriod() {
        return this.backingStore.get("reportPeriod");
    }
    /**
     * Gets the reportRefreshDate property value. The latest date of the content.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getReportRefreshDate() {
        return this.backingStore.get("reportRefreshDate");
    }
    /**
     * Gets the total property value. The total number of groups.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTotal() {
        return this.backingStore.get("total");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("active", this.getActive());
        writer.writeLocalDateValue("reportDate", this.getReportDate());
        writer.writeStringValue("reportPeriod", this.getReportPeriod());
        writer.writeLocalDateValue("reportRefreshDate", this.getReportRefreshDate());
        writer.writeLongValue("total", this.getTotal());
    }
    /**
     * Sets the active property value. The number of active groups. A group is considered active if any of the following occurred: group mailbox received email, or  a user viewed, edited, shared, or synced files in SharePoint document library, or a user viewed SharePoint pages, or a user posted, read, or liked messages in Yammer groups.
     * @param value Value to set for the active property.
     */
    public void setActive(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("active", value);
    }
    /**
     * Sets the reportDate property value. The date on which groups were active.
     * @param value Value to set for the reportDate property.
     */
    public void setReportDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("reportDate", value);
    }
    /**
     * Sets the reportPeriod property value. The number of days the report covers.
     * @param value Value to set for the reportPeriod property.
     */
    public void setReportPeriod(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reportPeriod", value);
    }
    /**
     * Sets the reportRefreshDate property value. The latest date of the content.
     * @param value Value to set for the reportRefreshDate property.
     */
    public void setReportRefreshDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("reportRefreshDate", value);
    }
    /**
     * Sets the total property value. The total number of groups.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("total", value);
    }
}

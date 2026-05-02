# MemoryLane AR

Offline-first Android app for location-anchored AR memory capsules.

## Principles
- Zero cloud dependency and no internet permission.
- On-device only storage via Room + internal media files.
- Device-to-device capsule transfer via Bluetooth, NFC, and local file/QR export.

## Current project state
This repository contains an MVP scaffold with:
- Android app module configured for API 28+.
- Offline-safe manifest permissions (no internet).
- Room entities for capsule metadata.
- Foreground geofence monitoring service stub.
- Initial activities for home, planting flow, and AR reveal fallback.

## Planned modules
- `.mlcap` package builder/importer (ZIP + encrypted payload).
- Bluetooth Classic/BLE discovery + transfer session manager.
- NFC short-text capsule payload exchange.
- ARCore local anchoring layer using GPS + compass + altitude.
- OSMDroid cached tile map and fallback coordinate map.
